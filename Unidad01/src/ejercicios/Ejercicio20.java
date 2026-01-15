package ejercicios;

import java.util.*;

public class Ejercicio20 {
    public static void main(String[] args){
        int capacidad1 = 3;
        int vaijes1 = 15;
        System.out.println("Introduce la capacidad de tu camion: ");
        int capacidad2 = new Scanner(System.in).nextInt();
        double viajes2 = 15*3/capacidad2;
        System.out.println("El camion con capacidad " + capacidad2 + " haria " + viajes2 + " viajes");
    }
}
