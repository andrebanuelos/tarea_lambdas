package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {


            System.out.println("Multiplicador");
            ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println("antes: " + numeros);
            OperacionesNumeros.multiplicar(numeros, 3);
            System.out.println("despues (x3): " + numeros);

            ArrayList<Integer> numeros2 = new ArrayList<>(Arrays.asList(4, null, -6));
            System.out.println("antes: " + numeros2);
            OperacionesNumeros.multiplicar(numeros2, 10);
            System.out.println("despues (x10): " + numeros2);

        ArrayList<Integer> vacia = new ArrayList<>();
        OperacionesNumeros.multiplicar(vacia, 2);
        System.out.println("lista vacia: " + vacia);
        OperacionesNumeros.multiplicar(null, 2);

        System.out.println();
        System.out.println("Filtro");
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("manzana", "mango", "pera", "Melon", "uva", "platano", "kiwi", "sandia"));
        System.out.println("antes: " + frutas);
        OperacionasCadenas.filtro(frutas, 'm', 5);
        System.out.println("despues (letra m, minimo 5): " + frutas);

        ArrayList<String> palabras = new ArrayList<>(Arrays.asList("hola", null, "", "mundo"));
        System.out.println("antes: " + palabras);
        OperacionasCadenas.filtro(palabras, 'z', 1);
        System.out.println("despues (letra z, minimo 1): " + palabras);

        ArrayList<String> vacia2 = new ArrayList<>();
        OperacionasCadenas.filtro(vacia2, 'a', 2);
        System.out.println("lista vacia: " + vacia2);
        OperacionasCadenas.filtro(null, 'a', 2);

        System.out.println();
        System.out.println("Mayusculas");
        ArrayList<String> lista3 = new ArrayList<>(Arrays.asList("java", "Lambda", null, "stream"));
        ArrayList<String> mayus = OperacionasCadenas.mayusculas(lista3);
        System.out.println("original: " + lista3);
        System.out.println("nueva: " + mayus);
        System.out.println("lista vacia: " + OperacionasCadenas.mayusculas(new ArrayList<>()));
        System.out.println("lista null: " + OperacionasCadenas.mayusculas(null));

        System.out.println();
        System.out.println("Cuadrados unicos");
        ArrayList<Integer> lista4 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, -4, null));
        System.out.println("lista: " + lista4);
        System.out.println("cuadrados de los pares: " + OperacionesNumeros.cuadrados(lista4));
        ArrayList<Integer> impares = new ArrayList<>(Arrays.asList(1, 3, 5));
        System.out.println("solo impares " + impares + ": " + OperacionesNumeros.cuadrados(impares));
        System.out.println("lista vacia: " + OperacionesNumeros.cuadrados(new ArrayList<>()));
        System.out.println("lista null: " + OperacionesNumeros.cuadrados(null));

        System.out.println();
        System.out.println("Mapa de longitudes ");
        ArrayList<String> lista5 = new ArrayList<>(Arrays.asList("sol", "computadora", "UABC", "sol", null));
            System.out.println("lista: " + lista5);
            System.out.println("mapa: " + OperacionasCadenas.longitudes(lista5));
           System.out.println("lista vacia: " + OperacionasCadenas.longitudes(new ArrayList<>()));
            System.out.println("lista null: " + OperacionasCadenas.longitudes(null));

        System.out.println();
        System.out.println("Inventario");
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("Laptop", 15000.0);
        productos.put("Mouse", 250.0);
        productos.put("Teclado", 900.0);
        productos.put("Audifonos", null);
        System.out.println("productos: " + productos);
             OperacionesNumeros.catalogo(productos);
              System.out.println("productos despues: " + productos);
         OperacionesNumeros.catalogo(new HashMap<>());
        OperacionesNumeros.catalogo(null);

        System.out.println();
        System.out.println("Frecuencias");
        ArrayList<String> lista7 = new ArrayList<>(Arrays.asList("rojo", "azul", "rojo", "verde", "rojo", "azul", null));
          System.out.println("lista: " + lista7);
        System.out.println("frecuencias: " + OperacionasCadenas.frecuencias(lista7));
        System.out.println("lista vacia: " + OperacionasCadenas.frecuencias(new ArrayList<>()));
        System.out.println("lista null: " + OperacionasCadenas.frecuencias(null));

        System.out.println();
        System.out.println("Clasificador");
        HashMap<String, Integer> mapa8 = new HashMap<>();
        mapa8.put("java", 10);
        mapa8.put("python", 3);
        mapa8.put("c", 5);
        mapa8.put("rust", 1);
        System.out.println("mapa: " + mapa8);
        System.out.println("minimo 5: " + OperacionasCadenas.clasificar(mapa8, 5));
        System.out.println("minimo 50: " + OperacionasCadenas.clasificar(mapa8, 50));
        System.out.println("mapa vacio: " + OperacionasCadenas.clasificar(new HashMap<>(), 1));
        System.out.println("mapa null: " + OperacionasCadenas.clasificar(null, 1));

          System.out.println();
        System.out.println("Palabras sin repetir");
        String frase = "El Sol sale y el sol se oculta, EL SOL siempre vuelve y la Luna tambien.";
        System.out.println("frase: " + frase);
        System.out.println("palabras de 3 o mas letras: " + OperacionasCadenas.sinRepetir(frase, 3));
        System.out.println("frase vacia: " + OperacionasCadenas.sinRepetir("", 3));
        System.out.println("frase null: " + OperacionasCadenas.sinRepetir(null, 3));


        System.out.println();
        System.out.println("Tope de frecuencias");
        HashMap<String, Integer> mapa10 = new HashMap<>();
        mapa10.put("perro", 12);
        mapa10.put("gato", 5);
        mapa10.put("pez", 3);
        mapa10.put("loro", 7);
        System.out.println("antes: " + mapa10);
        OperacionesNumeros.tope(mapa10, 5);
        System.out.println("despues (tope 5): " + mapa10);
        HashMap<String, Integer> vacio = new HashMap<>();
        OperacionesNumeros.tope(vacio, 5);
        System.out.println("mapa vacio: " + vacio);
        OperacionesNumeros.tope(null, 5);
    }
}
