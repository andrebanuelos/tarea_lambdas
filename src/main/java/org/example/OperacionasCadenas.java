package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class OperacionasCadenas {
    public static void filtro(ArrayList<String> lista, char letra, int n) {
        if (lista == null) {
            System.out.println("la lista es null");
            return;
        }
        lista.removeIf(p -> p == null || p.isEmpty()
                || Character.toLowerCase(p.charAt(0)) == Character.toLowerCase(letra)
                || p.length() < n);
    }


    public static ArrayList<String> mayusculas(ArrayList<String> lista) {
        ArrayList<String> nueva = new ArrayList<>();
        if (lista == null) {
            return nueva;
        }
        nueva = lista.stream()
                .filter(p -> p != null)
                .map(p -> p.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
        return nueva;
    }

    public static HashMap<String, Integer> longitudes(ArrayList<String> lista) {
        HashMap<String, Integer> mapa = new HashMap<>();
        if (lista == null) {
            return mapa;
        }

        mapa = lista.stream()
                .filter(p -> p != null)
                .collect(Collectors.toMap(p -> p, p -> p.length(), (a, b) -> a, HashMap::new));
        return mapa;
    }


    public static HashMap<String, Integer> frecuencias(ArrayList<String> lista) {
        HashMap<String, Integer> mapa = new HashMap<>();
        if (lista == null) {
            return mapa;
        }
        for (String p : lista) {
            if (p != null) {
                mapa.merge(p, 1, (a, b) -> a + b);
            }
        }
        return mapa;
    }


    public static ArrayList<String> clasificar(HashMap<String, Integer> mapa, int minimo) {
        ArrayList<String> lista = new ArrayList<>();
        if (mapa == null) {
            return lista;
        }
        lista = mapa.entrySet().stream()
                .filter(e -> e.getValue() != null && e.getValue() >= minimo)
                .map(e -> e.getKey())
                .collect(Collectors.toCollection(ArrayList::new));
        return lista;
    }


    public static HashSet<String> sinRepetir(String frase, int n) {
        HashSet<String> set = new HashSet<>();
        if (frase == null || frase.trim().isEmpty()) {
            return set;
        }
        String[] palabras = frase.trim().split("[ ,.;]+");
        set = Arrays.stream(palabras)
                .filter(p -> p.length() >= n)
                .map(p -> p.toLowerCase())
                .collect(Collectors.toCollection(HashSet::new));
        return set;
    }
}
