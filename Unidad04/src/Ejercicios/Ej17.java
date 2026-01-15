package Ejercicios;

import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        int[] numeros = {2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6};
        System.out.println("Introduce un numero: ");
        int num = new Scanner(System.in).nextInt();
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numerillo = numeros[i];
            if (numerillo == num){
                cont++;
            }
        }
        if (cont!=0){
            System.out.println("El numero " + num + " si esta en la lista, y esta un total de: " + cont);
        }else {
            System.out.println("El numero " + num + " no esta en la lista");
        }
    }
}
