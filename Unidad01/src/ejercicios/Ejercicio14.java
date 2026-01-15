package ejercicios;

import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args){
        System.out.println("Introduce una cantidad en €: ");
        double euros = new Scanner(System.in).nextDouble();

        final double CAMBIO_DOLARES = euros * 1.42;
        final double CAMBIO_LIBRAS = euros * 0.8713;
        final double CAMBIO_YENS = euros * 113.86;
        final double CAMBIO_PESETAS = euros * 166.386;

        System.out.println("La cantidad de euros introducida: " + euros +"€\nDolares: " + CAMBIO_DOLARES + "$\nLibras: " + CAMBIO_LIBRAS+ "£\nYens: " + CAMBIO_YENS + "¥\nPesetas: " + CAMBIO_PESETAS + "pts");
    }
}
