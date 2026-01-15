package Ejercicios;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("Introduce una frase para añadirla al nuevo documento: ");
        String frase1 = new Scanner(System.in).nextLine();
        System.out.println("Introduce otra frase para añadirla al nuevo documento: ");
        String frase2 = new Scanner(System.in).nextLine();

        try {
            PrintWriter archivo = new PrintWriter("frase.txt"); //La ruta
            archivo.println(frase1);
            archivo.println(frase2);
            archivo.close();
            System.out.println("Frases escritas con exito");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
