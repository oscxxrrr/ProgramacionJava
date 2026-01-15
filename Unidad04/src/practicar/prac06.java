package practicar;

import java.util.ArrayList;
import java.util.Scanner;

public class prac06 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Introduce un numero: ");
        int numero = new Scanner(System.in).nextInt();

        for (int i = 1; i <= numero; i++) {
            numeros.add(i);
            numeros.add(i-i*2);
        }
        System.out.println(numeros);
        int cont = 1;
        for (int i = 0; i < numeros.size()-1; i+=2) {
            System.out.println("Suma " + cont++ + ": ");
            int suma = numeros.get(i) + numeros.get(i+1);
            System.out.println(suma);
        }
    }
}
