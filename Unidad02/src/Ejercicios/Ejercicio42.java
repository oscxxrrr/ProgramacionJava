package Ejercicios;

import java.util.Random;

public class Ejercicio42 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        Random r1 = new Random();
        int numeroAleatorio = num1 + r1.nextInt(num2 - num1 + 1);
        System.out.println("Numero aleatorio generado: " + numeroAleatorio);
    }

}
