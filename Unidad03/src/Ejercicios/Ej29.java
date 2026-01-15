package Ejercicios;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args) {
        final String PASSWORD = "adriantrujillo";
        String palabra = " ";
        int cont = 5;

        while (!palabra.equalsIgnoreCase(PASSWORD)){
            System.out.println("Intenta adivinar la palabra: (numero de intentos: " + (cont) + ")");
            palabra = new Scanner(System.in).nextLine();
            cont--;
            if (!palabra.equalsIgnoreCase(PASSWORD)){
                System.out.println("Contraseña erronea");
            }else {
                System.out.println("CONTRASEÑA CORRECTA");
            }

        }
    }
}
