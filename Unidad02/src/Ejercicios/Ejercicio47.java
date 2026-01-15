package Ejercicios;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {
        Desktop escritorio = Desktop.getDesktop();
        System.out.println("Introduce la ruta del archivo que quieras abrir: ");
        String ruta = new Scanner(System.in).nextLine();
        File file = new File(ruta);
        try{
            escritorio.open(file);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}