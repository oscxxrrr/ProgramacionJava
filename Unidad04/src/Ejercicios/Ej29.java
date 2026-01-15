package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args) {
        String[] nombres = {"Pepe","Ana","Juan","Roberta"};
        String[] asignaturas = {"Programacion","Base de Datos","Sistemas","IPE"};

        Integer[][] notas = {
                {9,4,2,10},
                {5,8,5,10},
                {4,6,10,10},
                {3,5,2,9}
        };

        for (int i = 0; i < notas.length; i++) {
            int suma = 0;
            System.out.println("\nAlumno -->  " + nombres[i]);
            for (int j = 0; j < notas[i].length; j++) {
                suma+=notas[i][j];
                System.out.print(asignaturas[j] + " : " + notas[i][j] + "\n");
            }
            System.out.println();
            System.out.println("La media es: " + (1.0*suma/notas[i].length));
        }

    }
}
