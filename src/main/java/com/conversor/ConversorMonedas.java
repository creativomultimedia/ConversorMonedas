package com.conversor;

public class ConversorMonedas {

    private ApiClient apiClient;

    public ConversorMonedas() {
        this.apiClient = new ApiClient();
    }

    public void realizarConversion(String monedaOrigen, String monedaDestino, double cantidad) {
        double tasaCambio = apiClient.obtenerTasaCambio(monedaOrigen, monedaDestino);

        if (tasaCambio != -1) {
            double resultado = cantidad * tasaCambio;
            System.out.println(cantidad + " " + monedaOrigen + " son " + resultado + " " + monedaDestino);
        } else {
            System.out.println("Error al obtener la tasa de cambio.");
        }
    }
}
