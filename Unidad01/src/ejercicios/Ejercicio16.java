package ejercicios;

import java.util.*;

public class Ejercicio16 {
    public static void main(String[] args){

        final double PRECIO_ODISEA = 3.5;
        final double PRECIO_PADRINO = 2.95;
        double sumaPeliculas = PRECIO_ODISEA + PRECIO_PADRINO;

        System.out.println("Cuantos dias quieres alquilar las peliculas?");
        int diasTotales = new Scanner(System.in).nextInt();

        System.out.println("Cuanto quieres pagar?");
        int dineroPagar = new Scanner(System.in).nextInt();

        double preciototal = diasTotales * sumaPeliculas;

        System.out.println("Puede pagar? " + (dineroPagar >= preciototal));
        System.out.println("El precio total era " + preciototal + "€");
    }
}
