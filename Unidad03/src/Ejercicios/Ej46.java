package Ejercicios;

import java.util.Scanner;

public class Ej46 {
    public static void main(String[] args) {
        System.out.println("Introduce el valor de N: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n|| j == 1 || j == n){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
