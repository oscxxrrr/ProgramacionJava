package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args){
        System.out.print("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        int longitud = nombre.length(); //Cuenta los espacios
        String mayuscula = nombre.toUpperCase();
        String minuscula = nombre.toLowerCase();
        System.out.println(nombre + "\n" + mayuscula + "\n" + minuscula + "\n" + longitud);
    }
}
