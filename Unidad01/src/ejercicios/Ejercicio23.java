package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args){
        System.out.println("Introduce tu primera nota: ");
        double nota1 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce tu segunda nota: ");
        double nota2 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce tu tercera nota: ");
        double nota3 = new Scanner(System.in).nextDouble();

        double media = (nota1+nota2+nota3) / 3;

        if(media >= 5){
            System.out.println("Estas aprobado");
        }
        else{
            System.out.println("Estas suspendido");
        }


    }
}
