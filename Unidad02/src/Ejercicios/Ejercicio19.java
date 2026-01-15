package Ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args){
        final long FACTOR_MEGABYTE = 1024 * 1024;

        System.out.println("Introduce la ruta:");
        String ruta = new Scanner(System.in).nextLine();
        File f1 = new File(ruta);


        if(f1.isFile()){
            long bytes = f1.length();
            double megabytes = bytes * 1.0 / FACTOR_MEGABYTE;
            System.out.println("Ocupa un total de: " + bytes + " bytes y " + megabytes + " megabytes");
        }if (f1.isDirectory()){
            System.out.println("La ruta introducida es un directorio");
        }else {
            System.out.println("Ruta no encontrada");
        }



    }
}
