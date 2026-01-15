package Ejercicios;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args){
        String clave = "Programacion2025";
        System.out.println("Introduce la contraseña:");
        String password = new Scanner(System.in).nextLine();

        boolean comparacion = clave.equals(password);

        if(comparacion == true){
            System.out.println("La contraseña es correcta");
        }else {
            System.out.println("La contraseña es incorrecta");
        }
    }
}
