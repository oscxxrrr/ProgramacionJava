package Ejercicios;

import java.util.Scanner;

public class Ej33 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero para saber su tabla de multiplicar: ");
        int numero = new Scanner(System.in).nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + ") " + numero + " X " + i +" = " + numero * i);
        }
    }
}
