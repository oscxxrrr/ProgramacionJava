package Ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args){
        System.out.println("Introduce la ruta que deseas buscar:");
        String file = new Scanner(System.in).nextLine();
        File f1 = new File(file);

        boolean directorio = f1.isDirectory();

        if(directorio == true){
            File[] f1Info = f1.listFiles();
            int cantidad = f1Info.length;
            System.out.println(cantidad);
        }else {
            System.out.println("La ruta tiene que ser un directorio no un archivo");
        }
    }
}
