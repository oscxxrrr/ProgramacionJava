package Ejercicios;

import java.util.Random;
public class Ej30 {
    public static void main(String[] args) {
        Random random = new Random();
        Boolean[][] tablaBoleanos = new Boolean[4][3];
        for (int i = 0; i < tablaBoleanos.length; i++) {
            for (int j = 0; j < tablaBoleanos[i].length; j++) {
                tablaBoleanos[i][j] = new Random().nextBoolean();
            }
        }

        int contFalse = 0;
        int contTrue = 0;

        for (int i = 0; i < tablaBoleanos.length; i++) {
            for (int j = 0; j < tablaBoleanos[i].length; j++) {
                System.out.print(tablaBoleanos[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < tablaBoleanos.length; i++) {
            for (int j = 0; j < tablaBoleanos[i].length; j++) {
                if (tablaBoleanos[i][j] == false){
                    contFalse++;
                }else {
                    contTrue++;
                }
            }
        }

        System.out.println("Cantidad de true: " + contTrue + "\n" + "Cantidad de false: " + contFalse);
    }
}
