package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej27 {
    public static void main(String[] args) {
        String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};

        String[][] horario = {
                {"Base Datos","Base Datos", "IPEI", "Entorno Desarrollo", "Entorno Desarrollo", "Entorno Desarrollo"},
                {"Programacion","Programacion", "Base Datos", "Base Datos", "Sistemas Informaticos", "Sistemas Informaticos"},
                {"Programacion","Programacion", "Lenguaje Marcas","Lenguaje Marcas", "Base Datos", "Base Datos"},
                {"Programacion","Programacion","Lenguaje Marcas","Sostenibilidad","IPEI", "Digitalizacion"},
                {"Sistemas Informaticos","Sistemas Informaticos","Sistemas Informaticos","IPEI","Programacion","Programacion"}
        };

        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                System.out.print(horario[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Dime el nombre de una asignatura: ");
        String asignatura = new Scanner(System.in).nextLine();

        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (horario[i][j].equalsIgnoreCase(asignatura)) {
                    System.out.println("El dia " + dias[i] + " a " + (j + 1) + " hay " + horario[i][j]);
                }
            }
        }

        System.out.println("\nIntroduce una asignatura para saber cuántas horas hay:");
        String asign = new Scanner(System.in).nextLine();

        int cont = 0;
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (asign.equalsIgnoreCase(horario[i][j])) {
                    cont++;
                }
            }
        }
        System.out.println(asign + " tiene un total de " + cont + " horas a la semana.");
    }
}
