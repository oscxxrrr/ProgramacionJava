package Ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("Introduce una opcion: \n\t1) Escribir en el archivo\n\t2) Leer archivo\n\t3) Salir");
            opcion = new Scanner(System.in).nextInt();
            File file = new File("frases.txt");
            switch (opcion){
                case 1->{
                    try {
                        PrintWriter printWriter = new PrintWriter(file);
                        System.out.println("Introduce la primera frase: ");
                        String cadena1 = new Scanner(System.in).nextLine();
                        System.out.println("Introduce la segunda frase: ");
                        String cadena2 = new Scanner(System.in).nextLine();
                        printWriter.println(cadena1);
                        printWriter.println(cadena2);
                        printWriter.close();

                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2->{
                    try {
                        Scanner leer = new Scanner(file);
                        String linea1 = leer.nextLine();
                        String linea2 = leer.nextLine();
                        System.out.println("Primera frase: " + linea1 + "\nLinea 2: " + linea2);
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3 ->{
                    System.out.println("Saliendo...");
                }
            }
        }
    }
}
