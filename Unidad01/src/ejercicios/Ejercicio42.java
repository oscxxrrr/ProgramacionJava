package ejercicios;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args){
        double lado1 = 0;
        double lado2 = 0;
        double lado3 = 0;

        System.out.println("Introduce primer lado: ");
        lado1 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce segundo lado: ");
        lado2 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce tercer lado: ");
        lado3 = new Scanner(System.in).nextDouble();

        boolean rectangulo = (lado1 * lado1) == (lado2 * lado2) + (lado3 * lado3);
        boolean actuangulo = (lado1 * lado1) < (lado2 * lado2) + (lado3 * lado3);
        boolean abtusangulo = (lado1 * lado1) > (lado2 * lado2) + (lado3 * lado3);

        if (rectangulo == true){
            System.out.println("Es rectangulo");
        } else if (actuangulo == true) {
            System.out.println("Es Obtusangulo");
        }else if (abtusangulo == true) {
            System.out.println("Es Obtusangulo");
        }else{
            System.out.println("Introduce numeros validos.");
        }

    }
}
