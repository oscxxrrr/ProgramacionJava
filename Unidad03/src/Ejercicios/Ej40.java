package Ejercicios;

import java.util.Scanner;

public class Ej40 {
    public static void main(String[] args) {
        System.out.println("Introduce el valor de A: ");
        int a = new Scanner(System.in).nextInt();

        System.out.println("Introduce el valor de B: ");
        int b = new Scanner(System.in).nextInt();


        if (a < b) {
            int aux = a;
            a = b;
            b = aux;
        }
        while (b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println("Maximo comun divisor = " + a);



    }
}
