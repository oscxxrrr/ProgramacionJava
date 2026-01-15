package Ejercicios;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero decimal y lo pasare a binario y a hexadecimal: ");
        String numeroString = new Scanner(System.in).nextLine();

        int numero = Integer.parseInt(numeroString);
        System.out.println("El numero " + numero + " en base 10 pasado a:\nBinario = " + Integer.toBinaryString(numero) + "\nHexadecimal = " + Integer.toHexString(numero));
    }

}
