package Ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        String nombre = "";
        String dominio = "";

        System.out.println("Introduce tu nombre:");
        nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce tu dominio:");
        dominio = new Scanner(System.in).nextLine();

        if(dominio.endsWith(".com") || dominio.endsWith(".es")){
            System.out.println("Tu correo es: " + nombre + "@" + dominio);
        }else {
            System.out.println("Dominio incorrecto");
        }


    }
}
