package ejercicios;

import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args){
        int numero = 0;

        System.out.println("Introduce un numero y te digo si es par o impar");
        numero = new Scanner(System.in).nextInt();

        if(numero % 2 == 0){
            System.out.println("Tu numero es par");
        }
        else if (numero % 2 == 1) {
            System.out.println("Tu numero es impar");
        }
        else{
            System.out.println("Introduce un numero valido");
        }
    }
}
