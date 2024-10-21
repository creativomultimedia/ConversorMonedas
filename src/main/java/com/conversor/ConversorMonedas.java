package com.conversor;

public class ConversorMonedas {
    private final ApiClient apiClient;

    public ConversorMonedas() {
        this.apiClient = new ApiClient();
    }

    // Método para convertir una cantidad de una moneda a otra
    public double convertir(double cantidad, String monedaOrigen, String monedaDestino) {
        double tasaCambio = apiClient.obtenerTasaCambio(monedaOrigen, monedaDestino);
        if (tasaCambio != -1) {
            return cantidad * tasaCambio;
        } else {
            return -1; // Indicar que hubo un error en la conversión
        }
    }
}
