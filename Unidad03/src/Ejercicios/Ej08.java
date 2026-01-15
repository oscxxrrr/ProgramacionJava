package Ejercicios;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        int cont = 0;
        System.out.println("Introduce la cantidad de piezas que quieras cazar hoy:");
        int total = new Scanner(System.in).nextInt();
        System.out.println("--EMPEZAMOS LA CAZA--");
        boolean repetir = true;
        while (repetir != false) {
            System.out.println("Numero de piezas cazadas: ");
            int piezas = new Scanner(System.in).nextInt();
            cont = cont + piezas;
            if (cont >= total) {
                repetir = false;
                System.out.println("Todas las piezas han sido cazadas.");
            }
        }
    }
}
