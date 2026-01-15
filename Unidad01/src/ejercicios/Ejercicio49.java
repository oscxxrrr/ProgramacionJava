package ejercicios;

import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        int numPremiado = 7652;

        System.out.println("Introduce el primer numero: ");
        num1 = new Scanner(System.in).nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = new Scanner(System.in).nextInt();

        if(numPremiado % 10 == num1){
            System.out.println("El primer numero introducido coincide con la ultima cifra del numero premiado");
        }else{
            System.out.println("El primer numero introducido no coincide con la ultima cifra del numero premiado");
        }

        if(numPremiado / 1000 == num2){
            System.out.println("El segundo numero introducido coincide con la primera cifra del numero premiado");
        }else{
            System.out.println("El segundo numero introducido no coincide con la primera cifra del numero premiado");
        }
    }
}
