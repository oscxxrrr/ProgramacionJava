package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
        System.out.println("Introduce un valor 0,1 o -2 para calcular: ");
        int num = new Scanner(System.in).nextInt();

        double resultado = (num/2.0)*(num/2.0)*(num/2.0) *3/(num*num*num+3);
        System.out.println(resultado);
    }
}
