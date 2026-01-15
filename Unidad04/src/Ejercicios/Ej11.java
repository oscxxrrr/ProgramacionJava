package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        int mayor = 0;
        int num = 0;
        List<String> lista = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Palabra " + i + ":");
            String palabra = new Scanner(System.in).nextLine();
            lista.add(palabra);
        }
        for (int i = 0; i < lista.size(); i++) {
            String palabra = lista.get(i);
            int tamaño = palabra.length();
            if (tamaño > mayor){
                mayor = tamaño;

            }
        }
        System.out.println("La palabra mas grande es: " + lista.get(num));
    }
}
