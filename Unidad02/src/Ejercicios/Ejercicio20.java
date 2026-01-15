package Ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        System.out.println("Introduce la ruta:");
        String ruta = new Scanner(System.in).nextLine();
        File f1 = new File(ruta);
        boolean directorioSiNo = f1.isDirectory();
        if(directorioSiNo == true){
            System.out.println("La ruta introducida corresponde a un directorio.");
        }else{
            System.out.println("La ruta introducida es un archivo con tamaño de: " + f1.length() + " bytes");
            System.out.println("Desea borrarlo ?");
            String eleccion = new Scanner(System.in).nextLine();
            boolean borrar = eleccion.equalsIgnoreCase("si") || eleccion.equalsIgnoreCase("sí");

            if(borrar == true){
                boolean eliminar = f1.delete();
                System.out.println("Eliminado correctamente");
            }else{
                System.out.println("No se ha eliminado");
            }
        }
    }
}

