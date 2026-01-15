package Ejercicios;

import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        String[][] horario= {{"Base Datos", "IPEI", "Entorno Desarrollo"},
                            {"Programacion", "Base Datos", "Sistemas Informaticos"},
                            {"Programacion","Lenguaje Marcas", "Base Datos"},
                            {"Programacion","Lenguaje Marcas","Sostenibilidad","IPEI", "Digitalizacion"},
                            {"Sistemas Informaticos","IPEI","Programacion"}
        };
        System.out.println("Que dia de la semana quieres saber el horario de clase? ");
        String palabra = new Scanner(System.in).nextLine();

        if (palabra.equalsIgnoreCase("lunes")){
            System.out.println("El horario del lunes es: ");
            for (int i = 0; i < horario[0].length; i++) {
                System.out.println(horario[0][i]);
            }
        } else if (palabra.equalsIgnoreCase("martes")) {
            System.out.println("El horario del martes es: ");
            for (int i = 0; i < horario[1].length; i++) {
                System.out.println(horario[1][i]);
            }
        }else if (palabra.equalsIgnoreCase("miercoles")) {
            System.out.println("El horario del miercoles es: ");
            for (int i = 0; i < horario[2].length; i++) {
                System.out.println(horario[2][i]);
            }
        }else if (palabra.equalsIgnoreCase("jueves")) {
            System.out.println("El horario del jueves es: ");
            for (int i = 0; i < horario[3].length; i++) {
                System.out.println(horario[3][i]);
            }
        }else if (palabra.equalsIgnoreCase("viernes")) {
            System.out.println("El horario del viernes es: ");
            for (int i = 0; i < horario[4].length; i++) {
                System.out.println(horario[4][i]);
            }
        }
    }
}
