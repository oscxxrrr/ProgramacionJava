package Ejercicios;

import java.util.Random;

public class Ej05 {
    public static void main(String[] args) {
        int numAleatorio = 0;
        do {
            Random random = new Random();
            numAleatorio = random.nextInt(0,11);
            System.out.println("-"+numAleatorio);
        }while (numAleatorio != 10);
        System.out.println("El programa acabo, numero 10 generado.");
    }
}
