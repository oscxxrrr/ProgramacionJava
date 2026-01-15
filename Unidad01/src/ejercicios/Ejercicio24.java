package ejercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args){
        System.out.println("Introduce una edad: ");
        int edad1 =  new Scanner(System.in).nextInt();
        System.out.println("Introduce otra edad: ");
        int edad2 =  new Scanner(System.in).nextInt();

        boolean mayorEdad1 = edad1 >= 18;
        boolean mayorEdad2 = edad2 >= 18;
        boolean mayor = edad1 > edad2;

        System.out.println("La primera persona es mayor de edad? " +mayorEdad1 + "\nLa Segunda persona es mayor de edad? " + mayorEdad2 + "\nLa primera persona es mayor que la segunda persona? " + mayor);
    }
}
