package ejercicios;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;

        System.out.println("Introduce un numero: ");
        num1 = new Scanner(System.in).nextInt();
        System.out.println("Introduce otro numero: ");
        num2 = new Scanner(System.in).nextInt();

        if(num1 > num2){
            System.out.println(num1+" mayor que "+num2);
        }
        if(num2 > num1){
            System.out.println(num1+" menor que "+num2);
        }
        if(num1 == num2){
            System.out.println(num1+" igual que "+num2);
        }
    }
}
