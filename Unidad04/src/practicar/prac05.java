package practicar;

import java.util.Scanner;

public class prac05 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int num = new Scanner(System.in).nextInt();

        int[] numeros = new int[num*2];
        int cont = 1;
        for (int i = 0; i < numeros.length-1; i+=2) {
            numeros[i] = cont;
            numeros[i+1] = (-1)*(cont);
            cont++;
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
