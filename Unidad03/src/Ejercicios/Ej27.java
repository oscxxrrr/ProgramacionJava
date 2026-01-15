package Ejercicios;

import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        System.out.println("Introduce la base:");
        int base = new Scanner(System.in).nextInt();

        System.out.println("Introduce un exponente:");
        int exponente = new Scanner(System.in).nextInt();

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }

        System.out.println("Resultado: " + resultado);
    }
}
