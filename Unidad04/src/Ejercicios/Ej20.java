package Ejercicios;

import java.io.File;
import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        System.out.println("Introduce la ruta de una carpeta: ");
        String ruta = new Scanner(System.in).nextLine();
        File file = new File(ruta);
        if (file.isFile()){
            System.out.println("Tienes que introducir la ruta de una carpeta no de un archivo.");
        }else {
            File[] listado = file.listFiles();
            for (int i = 0; i < listado.length; i++) {
                System.out.println(listado[i]);
            }
        }

    }
}
