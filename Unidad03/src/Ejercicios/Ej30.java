package Ejercicios;

import java.util.Scanner;

public class Ej30 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase = new Scanner(System.in).nextLine();

        int longitud = frase.length();
        for (int i = 0; i < longitud; i++) {
            System.out.println(frase.charAt(i));
        }
    }
}
