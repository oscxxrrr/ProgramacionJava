package Ejercicios;

import java.util.Scanner;

public class Ej35 {
    public static void main(String[] args) {
        System.out.println("Introduce para ver si un numero es primo: ");
        int num = new Scanner(System.in).nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < num - 1 && esPrimo; i++) {
            if (num%i==0){
                esPrimo = false;
            }
        }
        if (esPrimo){
            System.out.println("El numero introducido SI es PRIMO");
        }else {
            System.out.println("El numero introducido NO es PRIMO");
        }
    }
}
