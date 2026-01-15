package ejemplos;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        int opcion = 0;
        double suma = 0;
        double resta = 0;
        double multiplicar = 0;
        double dividir = 0;
        double num1 = 0;
        double num2 = 0;

        System.out.println("Menu Principal: \nElige una opcion:\n1) Sumar:\n2) Restar\n3) Multiplicar\n4) Dividir\n5) Salir del programa");
        opcion = new Scanner(System.in).nextInt();

        while (opcion != 5){
            if(opcion == 1){
                System.out.println("Introduce el primer numero: ");
                num1 = new Scanner(System.in).nextInt();
                System.out.println("Introduce el segundo numero: ");
                num2 = new Scanner(System.in).nextInt();

                suma = num1 + num2;

                System.out.println("La suma de los numeros "+num1+" + "+ num2+" = "+ suma);
                System.out.println("Menu Principal: \nElige una opcion:\n1) Sumar:\n2) Restar\n3) Multiplicar\n4) Dividir\n5) Salir del programa");
                opcion = new Scanner(System.in).nextInt();
            } else if (opcion == 2) {
                System.out.println("Introduce el primer numero: ");
                num1 = new Scanner(System.in).nextInt();
                System.out.println("Introduce el segundo numero: ");
                num2 = new Scanner(System.in).nextInt();

                resta = num1 - num2;

                System.out.println("La resta de los numeros "+num1+" - "+ num2+" = "+ resta);
                System.out.println("Menu Principal: \nElige una opcion:\n1) Sumar:\n2) Restar\n3) Multiplicar\n4) Dividir\n5) Salir del programa");
                opcion = new Scanner(System.in).nextInt();
            } else if (opcion == 3) {
                System.out.println("Introduce el primer numero: ");
                num1 = new Scanner(System.in).nextInt();
                System.out.println("Introduce el segundo numero: ");
                num2 = new Scanner(System.in).nextInt();

                multiplicar = num1 * num2;

                System.out.println("La multiplicacion de los numeros "+num1+" x "+ num2+" = "+ multiplicar);
                System.out.println("Menu Principal: \nElige una opcion:\n1) Sumar:\n2) Restar\n3) Multiplicar\n4) Dividir\n5) Salir del programa");
                opcion = new Scanner(System.in).nextInt();
            } else if (opcion == 4) {
                System.out.println("Introduce el primer numero: ");
                num1 = new Scanner(System.in).nextInt();
                System.out.println("Introduce el segundo numero: ");
                num2 = new Scanner(System.in).nextInt();

                dividir = num1 / num2;

                System.out.println("La division de los numeros "+num1+" / "+ num2+" = "+ dividir);
                System.out.println("Menu Principal: \nElige una opcion:\n1) Sumar:\n2) Restar\n3) Multiplicar\n4) Dividir\n5) Salir del programa");
                opcion = new Scanner(System.in).nextInt();
            } else if (opcion == 5) {
                break;
            }
            else{
                System.out.println("Introduce una respuesta valida.");
                System.out.println("Menu Principal: \nElige una opcion:\n1) Sumar:\n2) Restar\n3) Multiplicar\n4) Dividir\n5) Salir del programa");
                opcion = new Scanner(System.in).nextInt();
            }
        }
    }
}
