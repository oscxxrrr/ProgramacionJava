package Ejercicios;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {

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
        System.out.println("\nIntroduce una asignatura para saber cuántas horas hay:");
        String asign = new Scanner(System.in).nextLine();
        int cont = 0;
        int cont2 = 0;
        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (asign.equalsIgnoreCase(horario[i][j])) {
                    cont++;
                }
            }
            if (asign.equalsIgnoreCase(horario[i][0])) {
                cont2++;
            }
        }
        System.out.println(asign + " tiene un total de " + cont + " horas a la semana.");
        System.out.println(asign + " hay a primera hora un total de " + cont2 + " veces.");
    }
}
