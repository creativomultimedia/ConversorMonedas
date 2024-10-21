package com.conversor;

import java.util.ArrayList;
import java.util.List;

public class ConversionHistory {
    private final List<ConversionEntry> historial;

    public ConversionHistory() {
        this.historial = new ArrayList<>();
    }

    // Método para agregar una conversión al historial
    public void agregarConversion(ConversionEntry entry) {
        historial.add(entry);
    }

    // Método para mostrar todo el historial de conversiones
    public void mostrarHistorial() {
        if (historial.isEmpty()) {
            System.out.println("No hay conversiones registradas.");
            return;
        }

        System.out.println("\nHistorial de Conversiones:");
        for (ConversionEntry entry : historial) {
            System.out.println(entry);
        }
    }
}
