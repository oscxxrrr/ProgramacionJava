package Ejercicios;

import bpc.daw.objetos.Caja;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero:");
        int numero = new Scanner(System.in).nextInt(); //InputMismatchException

        Caja caja1 = new Caja(null);
        String mensaje = caja1.getMensaje();
        int longitud = mensaje.length();
        System.out.println("Su longitud es: " + longitud); //NullPointerException

    }
}
