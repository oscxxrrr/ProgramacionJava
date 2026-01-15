package ejercicios;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args){
        int numero = 0;

        System.out.println("Introduce un numero entre el rango 10 y 56: ");
        numero = new Scanner(System.in).nextInt();

        if(numero >= 10 && numero <= 56){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
    }
}
