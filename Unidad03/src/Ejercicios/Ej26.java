package Ejercicios;

import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {

        System.out.println("Palabra 1:");
        String palabra1 = new Scanner(System.in).nextLine();
        System.out.println("Palabra 2:");
        String palabra2 = new Scanner(System.in).nextLine();

        int longitud1 = palabra1.length();
        int longitud2 = palabra2.length();
        char caracter1 = ' ';
        char caracter2 = ' ';

        if (longitud1 > longitud2){
            for (int i = 1; i < longitud1; i++) {
                caracter1 = palabra1.charAt(i);
                caracter2 = palabra2.charAt(i);
                if (caracter1 != caracter2){
                    System.out.println("La letra diferente se encuentra en la posicion " + i);
                }
            }
        } else if (longitud2 > longitud1) {
            for (int i = 1; i < longitud2; i++) {
                caracter1 = palabra1.charAt(i);
                caracter2 = palabra2.charAt(i);
                if (caracter1 != caracter2){
                    System.out.println("La letra diferente se encuentra en la posicion " + i);
                }
            }
        }else {
            for (int i = 1; i < longitud1; i++) {
                caracter1 = palabra1.charAt(i);
                caracter2 = palabra2.charAt(i);
                if (caracter1 != caracter2){
                    System.out.println("La letra diferente se encuentra en la posicion " + i);
                }
            }
        }
    }
}
