package com.conversor;

import java.util.Scanner;

public class ConversorMonedasApp {
    private final ConversorMonedas conversorMonedas;
    private final ConversionHistory conversionHistory;

    public ConversorMonedasApp() {
        this.conversorMonedas = new ConversorMonedas();
        this.conversionHistory = new ConversionHistory();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al Conversor de Monedas!");

        while (true) {
            System.out.println("\nSeleccione el país de origen:");
            String[] paises = Moneda.obtenerPaises();
            for (int i = 0; i < paises.length; i++) {
                System.out.println((i + 1) + ". " + paises[i]);
            }
            System.out.print("Número del país de la moneda de origen: ");
            int paisOrigenIndex = scanner.nextInt() - 1;
            if (paisOrigenIndex < 0 || paisOrigenIndex >= paises.length) {
                System.out.println("Opción no válida. Intente nuevamente.");
                continue;
            }
            String monedaOrigen = Moneda.getCodigoMoneda(paises[paisOrigenIndex]);

            System.out.println("\nSeleccione el país de destino:");
            for (int i = 0; i < paises.length; i++) {
                System.out.println((i + 1) + ". " + paises[i]);
            }
            System.out.print("Número del país de la moneda de destino: ");
            int paisDestinoIndex = scanner.nextInt() - 1;
            if (paisDestinoIndex < 0 || paisDestinoIndex >= paises.length || paisDestinoIndex == paisOrigenIndex) {
                System.out.println("Opción no válida. Intente nuevamente.");
                continue;
            }
            String monedaDestino = Moneda.getCodigoMoneda(paises[paisDestinoIndex]);

            System.out.print("Ingrese la cantidad: ");
            double cantidad = scanner.nextDouble();

            double resultado = conversorMonedas.convertir(cantidad, monedaOrigen, monedaDestino);
            if (resultado != -1) {
                ConversionEntry entry = new ConversionEntry(cantidad, monedaOrigen, resultado, monedaDestino);
                conversionHistory.agregarConversion(entry);
                System.out.println(entry);

                // Mostrar el historial de conversiones inmediatamente después de cada conversión
                conversionHistory.mostrarHistorial();
            } else {
                System.out.println("Error en la conversión. Por favor, intente nuevamente.");
            }

            System.out.print("\n¿Desea realizar otra conversión? (s/n): ");
            scanner.nextLine(); // Limpiar el buffer
            String continuar = scanner.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        ConversorMonedasApp app = new ConversorMonedasApp();
        app.iniciar();
    }
}
