package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Palabra " + i + ":");
            String palabra = new Scanner(System.in).nextLine();
            lista.add(palabra);
        }
        for (int i = 1; i <= 10; i++) {
            String enseñar = lista.get(i);
            System.out.println(enseñar);
        }

    }
}
