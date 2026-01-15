package Ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args){
        System.out.println("Cual es tu correo electronico:");
        String correo = new Scanner(System.in).nextLine();

        int arroba = correo.indexOf("@");
        String extraerDominio = correo.substring(arroba + 1);
        String extraerNombre = correo.substring(0, arroba);

        System.out.println("El nombre es: " + extraerNombre + "\nTu dominio es: " + extraerDominio);
    }
}
