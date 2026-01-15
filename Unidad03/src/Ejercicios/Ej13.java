package Ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        boolean repetir = true;
        System.out.println("Introduce la ruta del archivo a leer: ");
        String ruta = new Scanner(System.in).nextLine();
        try {
            FileReader fileReader = new FileReader(ruta);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (repetir){
                String leer = bufferedReader.readLine();
                if (leer == null){
                    repetir = false;
                }else {
                    System.out.println(leer);
                }
            }
            fileReader.close();
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("""
                ----------------------------------
                No hay mas lineas a leer.
                """);
    }
}
