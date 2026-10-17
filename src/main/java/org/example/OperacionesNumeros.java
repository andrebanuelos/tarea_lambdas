package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class OperacionesNumeros {
    public static void multiplicar(ArrayList<Integer> lista, int factor) {
        if (lista == null) {
            System.out.println("la lista es null");
            return;
        }
        lista.replaceAll(n -> {
            if (n == null) {
                return null;
            }
            return n * factor;
        });
    }

    public static HashSet<Integer> cuadrados(ArrayList<Integer> lista) {
        HashSet<Integer> resultado = new HashSet<>();
        if (lista == null) {
            return resultado;
        }
        resultado = new HashSet<>(lista.stream()
                .filter(n -> n != null)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toSet()));
        return resultado;
    }

    public static void catalogo(HashMap<String, Double> productos) {
        if (productos == null || productos.isEmpty()) {
            System.out.println("no hay productos");
            return;
        }
        productos.forEach((nombre, precio) -> {
            if (precio == null) {
                System.out.println(nombre + " no tiene precio");
            } else {
                double descuento = precio * 0.9;
                System.out.println(nombre + " precio: " + precio + " con descuento: " + descuento);
            }
        });
    }

    public static void tope(HashMap<String, Integer> mapa, int n) {
        if (mapa == null) {
            System.out.println("el mapa es null");
            return;
        }
        mapa.replaceAll((palabra, frec) -> {
            if (frec != null && frec > n) {
                return n;
            }
            return frec;
        });
    }
}
