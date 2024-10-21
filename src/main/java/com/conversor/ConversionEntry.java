package com.conversor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConversionEntry {
    private final double cantidad;
    private final String monedaOrigen;
    private final double resultado;
    private final String monedaDestino;
    private final LocalDateTime fechaHora;

    public ConversionEntry(double cantidad, String monedaOrigen, double resultado, String monedaDestino) {
        this.cantidad = cantidad;
        this.monedaOrigen = monedaOrigen;
        this.resultado = resultado;
        this.monedaDestino = monedaDestino;
        this.fechaHora = LocalDateTime.now(); // Guarda la fecha y hora actual
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return String.format("%s: %.2f %s = %.2f %s",
                fechaHora.format(formatter), cantidad, monedaOrigen, resultado, monedaDestino);
    }
}
