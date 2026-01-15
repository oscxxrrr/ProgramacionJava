package Ejercicios;

import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero total de palabras: ");
        int numeroPalabras = new Scanner(System.in).nextInt();
        String[] palabras = new String[numeroPalabras];
        int numPalabras = 1;
        for (int i = 0; i < numeroPalabras; i++) {
            System.out.println("Introduce una palabra: ");
            String cadena = new Scanner(System.in).nextLine();
            palabras[i] = cadena;
        }
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i] + " " + (i+1));
        }
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            System.out.println(" ");
            if (palabra.contains("a")){
                System.out.println("Palabra " + numPalabras + " que contiene 'a' "+ palabra);
                numPalabras+=1;
            }
        }
    }
}
