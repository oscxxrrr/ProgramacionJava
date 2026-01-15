package practicar;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prac07 {
    public static void main(String[] args) {
        System.out.println("Cuantas palabras quieres introducir? ");
        int numPalabras = new Scanner(System.in).nextInt();
        String[] nombres = new String[numPalabras];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce un numero: ");
            nombres[i] = new Scanner(System.in).nextLine();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " " +(i+1));
        }
        System.out.println("Las palabras que contienen la A aparte: ");
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].contains("a")){
                System.out.println(nombres[i]);
            }
        }

    }
}
