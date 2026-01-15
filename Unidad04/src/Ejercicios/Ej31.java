package Ejercicios;

import java.util.Scanner;

public class Ej31 {
    public static void main(String[] args) {
        System.out.println("Numero de filas: ");
        int filas = new Scanner(System.in).nextInt();
        System.out.println("Numero de columnas: ");
        int columnas = new Scanner(System.in).nextInt();

        int[][] tablaNum = new int[filas][columnas];

        for (int i = 0; i < tablaNum.length; i++) {
            for (int j = 0; j < tablaNum[i].length; j++) {
                tablaNum[i][j] = i+j;
            }
        }

        for (int i = 0; i < tablaNum.length; i++) {
            for (int j = 0; j < tablaNum[i].length; j++) {
                System.out.print(" " + tablaNum[i][j]);
            }
            System.out.println();
        }

    }
}
