package Ejercicios;

import java.util.Scanner;

public class Ej23 {
    public static void main(String[] args) {
        String[] lista = new String[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Palabra " + (i+1) + ": ");
            String palabra = new Scanner(System.in).nextLine();
            lista[i] = palabra;
        }

        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}
