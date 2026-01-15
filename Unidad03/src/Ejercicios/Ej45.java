package Ejercicios;

import java.util.Scanner;

public class Ej45 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero N: ");
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
