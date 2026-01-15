package Ejercicios;

import java.util.Scanner;

public class Ej34 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int numero = new Scanner(System.in).nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero%i==0){
                System.out.println("Los divisores del numero " + numero + " son: " + i);
            }
        }
    }
}