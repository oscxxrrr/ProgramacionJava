package Ejercicios;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        boolean repetir = true;
        while (repetir){
            System.out.println("Eres mayor de edad? (si, no)");
            String respuesta = new Scanner(System.in).nextLine();
            if(respuesta.equalsIgnoreCase("si")){
                System.out.println("El usuario es mayor de edad.");
                repetir = false;
            } else if (respuesta.equalsIgnoreCase("no")) {
                System.out.println("Usuario menor de edad");
                repetir = false;
            }else {
                System.out.println("Introduce una respuesta correcta.");
            }
        }
    }
}
