package Ejercicios;

import java.io.*;
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        boolean repetir = true;
        while (repetir){
            System.out.println("""
                    Menu Principal:
                        1) Añadir alumno
                        2) Ver datos de un alumno
                        3) Borrar alumno
                        4) Salir
                    Elige una opcion:
                    """);
            int opcion = new Scanner(System.in).nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Introduce el DNI del alumno: ");
                    String dni = new Scanner(System.in).nextLine();
                    System.out.println("Nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("Direccion: ");
                    String direccion = new Scanner(System.in).nextLine();
                    System.out.println("Numero telefono: ");
                    String telefono = new Scanner(System.in).nextLine();

                    File file = new File(dni+".txt");
                    try {
                        PrintWriter printWriter = new PrintWriter(file);
                        printWriter.println("Nombre: "+nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono);
                        printWriter.close();
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2->{
                    try {
                        System.out.println("Introduce el DNI del alumno que buscas: ");
                        String dni = new Scanner(System.in).nextLine();

                        File file = new File(dni+".txt");

                        boolean caso2repetir = true;
                        FileReader fileReader = new FileReader(file);
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while (caso2repetir){
                            String leer = bufferedReader.readLine();
                            if (leer == null){
                                caso2repetir = false;
                            }else {
                                System.out.println(leer);
                            }
                        }
                        fileReader.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 3->{
                    System.out.println("Introduce el DNI del alumno que quieras eliminar:");
                    String dni = new Scanner(System.in).nextLine();
                    File file = new File(dni+".txt");
                    boolean caso3Repetir = true;

                    if (file.exists()){
                            file.delete();
                            System.out.println("Alumno eliminado con exito !!!");

                    }else {
                            System.out.println("Alumno no encontrado intentalo de nuevo.");
                        }
                    }
                case 4->{
                    System.out.println("Saliendo del programa....");
                    repetir = false;
                }
                default -> System.out.println("Elige una opcion valida.");
            }
        }
    }
}
