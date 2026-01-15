package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        File leerArchivo = new File("frase.txt");
        try {
            Scanner leer = new Scanner(leerArchivo);

            String linea1 = leer.nextLine(); //Leer linea
            String linea2 = leer.nextLine(); //Leer siguiente linea
            System.out.println("Contenido del archivo: \n" + linea1 + "\n" + linea2);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
