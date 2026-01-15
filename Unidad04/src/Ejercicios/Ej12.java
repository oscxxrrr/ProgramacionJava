package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int numero = new Random().nextInt(0,101);
            listaNumeros.add(numero);
        }
        for (int numeros: listaNumeros){
            System.out.println(numeros);
        }

        System.out.println("Introduce un numero y compruebo si esta en la lista: ");
        int num = new Scanner(System.in).nextInt();

        if (listaNumeros.contains(num)){
            System.out.println("El numero " + num + " SI esta en la lista.");
        }else {
            System.out.println("El numero " + num + " NO esta en la lista.");
        }
    }
}
