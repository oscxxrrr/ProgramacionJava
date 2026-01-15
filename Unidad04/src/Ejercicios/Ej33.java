package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ej33 {
    public static void main(String[] args) {
        System.out.println("Introduce el numero de filas para la tabla: ");
        int filas = new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de columnas: ");
        int columnas = new Scanner(System.in).nextInt();

        int[][] tablaNum = new int[filas][columnas];

        for (int i = 0; i < tablaNum.length; i++) {
            for (int j = 0; j < tablaNum[i].length; j++) {
                tablaNum[i][j] = new Random().nextInt(1,11);
            }
        }

        for (int i = 0; i < tablaNum.length; i++) {
            for (int j = 0; j < tablaNum[i].length; j++) {
                System.out.print(tablaNum[i][j]);
            }
            System.out.println();
        }
        int suma = 0;
        for (int i = 0; i < tablaNum.length; i++) {
            for (int j = 0; j < tablaNum[i].length; j++) {
                suma = suma + tablaNum[i][j];
            }
        }

        System.out.println("La suma de todos los numeros de la tabla es = " + suma);

    }
}
