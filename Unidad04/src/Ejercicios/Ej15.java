package Ejercicios;

import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'};

        System.out.println("Introduce tu numero de DNI y te digo la letra que corresponde: ");
        int DNI = new Scanner(System.in).nextInt();

        int posicion = DNI%23;

        System.out.println("DNI --> " + DNI + "\nLetra --> " + letra[posicion]);
    }
}
