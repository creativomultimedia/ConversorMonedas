package com.conversor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ApiClient {

    private static final String API_KEY = "13fcc0c7e50dfd6ec45df8b9";  // Coloca tu API key aquí
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double obtenerTasaCambio(String monedaOrigen, String monedaDestino) {
        String urlString = BASE_URL + API_KEY + "/latest/" + monedaOrigen;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder content = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }

                in.close();
                connection.disconnect();

                // Parsear el JSON de la respuesta
                JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

                // Verificar si la moneda destino está disponible
                if (rates.has(monedaDestino)) {
                    return rates.get(monedaDestino).getAsDouble();
                } else {
                    System.out.println("Moneda destino no válida: " + monedaDestino);
                    return -1; // Indicar que hubo un error
                }

            } else {
                System.out.println("Error en la solicitud: " + responseCode);
                return -1; // Indicar que hubo un error
            }

        } catch (Exception e) {
            System.out.println("Error al realizar la solicitud: " + e.getMessage());
            return -1; // Indicar que hubo un error
        }
    }
}
