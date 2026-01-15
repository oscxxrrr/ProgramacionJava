package Ejercicios;

import java.util.Scanner;

public class Ej34 {
    public static void main(String[] args) {

        String[] spanish = {
                "casa", "agua", "sol", "luna",
                "mesa", "silla", "pan", "perro",
                "amigo", "madre", "padre", "dia",
                "niño", "manzana", "calle", "escuela",
                "libro","gato","noche","feliz"
        };

        String[] ingles = {
                "house", "water", "sun", "moon",
                "table", "chair", "bread", "dog",
                "friend", "mother", "father", "day",
                "child", "apple", "street", "school",
                "book","cat","night", "happy"
        };

        String[][] tabla = new String[2][20];
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i == 0){
                    tabla[0][j] = spanish[j];
                }else {
                    tabla[1][j] = ingles[j];
                }
            }
        }


        System.out.println("Introduce la palabra en español que quieras traducirla en ingles: ");
        String palabra = new Scanner(System.in).nextLine();

        boolean encontrada = false;

        for (int j = 0; j < tabla[0].length; j++) {
            if (palabra.equalsIgnoreCase(tabla[0][j])) {
                System.out.println("La traduccion es: " + tabla[1][j]);
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("La palabra no está en el diccionario.");
        }
    }
}
