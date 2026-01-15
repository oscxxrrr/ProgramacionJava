package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ej44 {
    public static void main(String[] args) {
        final String ABECEDARIO = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZZ";
        int longCadena = ABECEDARIO.length();
        Random random = new Random();
        System.out.println("Introduce un numero de matriculas: ");
        int matriculas = new Scanner(System.in).nextInt();
        for (int i = 1; i <= matriculas; i++) {
            System.out.println("Matricula " + i + ":");
            int numRandom = random.nextInt(1000,9999);
            System.out.print(numRandom);
            for (int j = 0; j < 3; j++) {
                int letraRandom = random.nextInt(0,longCadena);
                char letra = ABECEDARIO.charAt(letraRandom);
                System.out.print(letra);
            }
            System.out.println("\n");
        }
    }
}
