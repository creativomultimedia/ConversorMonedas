package com.conversor;

import java.util.Scanner;

public class ConversorMonedasApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorMonedas conversorMonedas = new ConversorMonedas();
        int opcion;

        System.out.println("Bienvenido al Conversor de Monedas!");

        do {
            System.out.println("\nElija una opción válida:");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Dólar a Soles Peruanos");
            System.out.println("8. Soles Peruanos a Dólar");
            System.out.println("9. Salir");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                System.out.println("Introduce la cantidad a convertir:");
                double cantidad = scanner.nextDouble();

                switch (opcion) {
                    case 1:
                        conversorMonedas.realizarConversion("USD", "ARS", cantidad);
                        break;
                    case 2:
                        conversorMonedas.realizarConversion("ARS", "USD", cantidad);
                        break;
                    case 3:
                        conversorMonedas.realizarConversion("USD", "BRL", cantidad);
                        break;
                    case 4:
                        conversorMonedas.realizarConversion("BRL", "USD", cantidad);
                        break;
                    case 5:
                        conversorMonedas.realizarConversion("USD", "COP", cantidad);
                        break;
                    case 6:
                        conversorMonedas.realizarConversion("COP", "USD", cantidad);
                        break;
                    case 7:
                        conversorMonedas.realizarConversion("USD", "PEN", cantidad);
                        break;
                    case 8:
                        conversorMonedas.realizarConversion("PEN", "USD", cantidad);
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                        break;
                }
            }

        } while (opcion != 9);

        System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
    }
}
