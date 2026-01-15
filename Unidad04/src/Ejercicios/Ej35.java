package Ejercicios;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ej35 {
    public static void main(String[] args) {
        Set<String> mensajes = new HashSet<>();
        mensajes.add("Silla");
        mensajes.add("Mesa");
        mensajes.add("Niño");
//        mensajes.add("Mesa");
        mensajes.add("Casa");
//        mensajes.add("Silla");
        mensajes.add("Lapiz");

        //NO SE PUEDEN VALORES REPETIDOS

        System.out.println("Tamaño set: " + mensajes.size());
        System.out.println(mensajes);

    }
}
