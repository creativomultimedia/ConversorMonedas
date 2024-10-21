package com.conversor;

import java.util.HashMap;
import java.util.Map;

public class Moneda {
    private static final Map<String, String> monedas = new HashMap<>();

    static {
        monedas.put("Argentina", "ARS");
        monedas.put("Brasil", "BRL");
        monedas.put("Colombia", "COP");
        monedas.put("Perú", "PEN");
        monedas.put("Estados Unidos", "USD");
    }

    public static String getCodigoMoneda(String pais) {
        return monedas.get(pais);
    }

    public static String[] obtenerPaises() {
        return monedas.keySet().toArray(new String[0]);
    }
}
