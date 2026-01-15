package Ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        String frase1 = "";
        String frase2= "";

        System.out.println("Introduce la primera frase:");
        frase1 = new Scanner(System.in).nextLine();
        System.out.println("Introduce la segunda frase:");
        frase2 = new Scanner(System.in).nextLine();

        boolean comparacion = frase1.contains(frase2);

        if (comparacion) {
            System.out.println("La segunda frase está dentro de la primera.");
        } else {
            System.out.println("La segunda frase NO está dentro de la primera.");
        }
    }
}
