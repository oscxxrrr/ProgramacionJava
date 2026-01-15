package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        int mayor = 0;
        int menor = 0;
        List<Integer> lista = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            System.out.println("Palabra " + i + ":");
            int numero = new Scanner(System.in).nextInt();
            lista.add(numero);

            if (i == 1) {
                mayor = numero;
                menor = numero;
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            int mostrar = lista.get(i);

            if (mostrar > mayor) {
                mayor = mostrar;
            }
            if (mostrar < menor) {
                menor = mostrar;
            }
        }
        System.out.println("El numero mayor es: " + mayor + "\nEl numero menor es: " + menor);

    }
}
