package Ejercicios;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        System.out.println("Introduce una palabra: ");
        String cadena = new Scanner(System.in).nextLine();
        int longitud = cadena.length();
        int mitad = longitud / 2;
        char letraCentral = ' ';

        if (longitud % 2 == 1){
            letraCentral = cadena.charAt(mitad);

        }else{
            System.out.println("Tu palabra es par, por lo tanto hay dos posibilidades, elige cual de las 2 quieres ver: \n\ti) Izquierda: \n\td) Derecha ");
            char opcion = new Scanner(System.in).nextLine().charAt(0);
            letraCentral = switch (opcion){
                case 'i','I' -> {
                    yield cadena.charAt(mitad - 1);
                }
                case 'd','D' -> {
                    yield cadena.charAt(mitad);
                }
                default -> {
                    System.out.println("Elige una opcion valida");
                    yield ' ';
                }
            };
        }
        System.out.println("Palabra: " + cadena + "\nLetra central: " + letraCentral);
    }
}
