package Simulacro03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        System.out.println("Introduce tu numero de ISBN: ");
        String isbn = new Scanner(System.in).nextLine();

        if (isbn.length() != 13) {
            System.out.println("Error, el ISBN introducido no tiene 13 digitos.");
        } else {
            String identificador = isbn.substring(0, 3);
            if (identificador.equals("978") || identificador.equals("979")) {
                System.out.println("Identificador correcto");

                System.out.println("Que campo quiere consultar: \n) Identificador\n2) Codigo del pais\n3) Codigo de editor\n4) Numero del articulo\n5) Digito de control\n6) Guardar\nSelecciona una opcion:");
                int opcion = new Scanner(System.in).nextInt();

                if (opcion == 1) {
                    System.out.println("Identificador --> " + isbn.substring(0, 3));
                } else if (opcion == 2) {
                    System.out.println("Codigo del pais --> " + isbn.substring(3, 5));
                } else if (opcion == 3) {
                    System.out.println("Codigo de editor --> " + isbn.substring(5, 9));
                } else if (opcion == 4) {
                    System.out.println("Numero del articulo --> " + isbn.substring(9, 12));
                } else if (opcion == 5) {
                    System.out.println("Digito de control --> " + isbn.substring(12));
                } else if (opcion == 6) {
                    try {
                        File archivo = new File("Libro.xml");
                        PrintWriter printWriter = new PrintWriter(archivo);
                        printWriter.println("<?xml version=’1.0’ encoding=’UTF-8’?>\n" +
                                "<isbn identificador="+isbn.substring(0,3)+">\n" +
                                "<codigo_pais>"+isbn.substring(3,5)+"</codigo_pais>\n" +
                                "<codigo_editor>"+ isbn.substring(5,9)+"</codigo_editor>\n" +
                                "<numero_articulo>"+isbn.substring(9,12)+"</numero_articulo>\n" +
                                "<digito_control>"+isbn.substring(12)+"</digito_control>\n" +
                                "</isbn>");
                        printWriter.close();

                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Opcion no valida.");
                }
            } else {
                System.out.println("Identificador erroneo");
            }
        }
    }
}
