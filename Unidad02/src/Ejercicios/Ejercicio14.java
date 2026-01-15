package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args){
        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        int mitad = nombre.length() / 2;
        char letra = nombre.charAt(mitad);
        System.out.println("La letra que se encuentra en la mitad de la palabra " + "'"+nombre+"'" + " es: " + "'"+letra+"'" + "\nYa que se encuentra en la posicion " + mitad);
    }
}
