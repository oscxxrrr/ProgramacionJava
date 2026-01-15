package ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args){
        System.out.println("Cuantos años tienes? ");
        int edad = new Scanner(System.in).nextInt();
        boolean mayorEdad = edad >= 18;

        System.out.println("Vas acompañado? true or false ");
        boolean podersalirSiNo = new Scanner(System.in).nextBoolean();

        boolean salirCentro = (mayorEdad || podersalirSiNo);

        System.out.println("Puede salir: " + salirCentro);
    }
}
