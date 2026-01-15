package ejercicios;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args){
        int numero = 2025;

        System.out.println("Introduce un numero y te digo si es bisiesto: ");
        numero = new Scanner(System.in).nextInt();

        if ((numero % 4 == 0 && numero % 100 != 0) || (numero % 400 == 0)){
            System.out.println("El numero introducido es bisiesto");
        } else{
            System.out.println("El numero no es bisiesto");
        }
    }
}
