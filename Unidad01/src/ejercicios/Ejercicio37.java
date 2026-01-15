package ejercicios;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Introduce el primer numero: ");
        num1 = new Scanner(System.in).nextInt();
        System.out.println("Introduce el segundo numero: ");
        num2 = new Scanner(System.in).nextInt();
        System.out.println("Introduce el tercer numero: ");
        num3 = new Scanner(System.in).nextInt();


        if(num1 > num2 && num1 > num3){
            System.out.println("El mayor es "+num1);
        }

        if(num2 > num1 && num2 > num3){
            System.out.println("El mayor es "+num2);
        }

        if(num3 > num1 && num3 > num2){
            System.out.println("El mayor es "+num3);
        }

        //Observacion, en este programa si queremos hacer absolutamente todas las comparaciones el codigo seria infinito.
    }
}
