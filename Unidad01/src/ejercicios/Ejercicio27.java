package ejercicios;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String [] args){
        System.out.println("Introduce tu edad: ");
        int edad = new Scanner(System.in).nextInt();

        boolean menorEdad = edad < 18;
        boolean mayorSesenta = edad >= 60;

        System.out.println("Tienes descuento: " + (menorEdad||mayorSesenta));

    }
}
