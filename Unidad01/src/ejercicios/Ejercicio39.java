package ejercicios;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String [] args){
        double nota = 0;

        System.out.println("Introduce tu nota: ");
        nota = new Scanner(System.in).nextDouble();

        if(nota < 5){
            System.out.println("Suspenso");
        }
        else if (nota >=5 && nota < 6) {
            System.out.println("Suficiente");
        }
        else if (nota >=6 && nota < 7) {
            System.out.println("Bien");
        }
        else if (nota >=7 && nota < 9) {
            System.out.println("Notable");
        }
        else if (nota >=9 && nota < 10) {
            System.out.println("Sobresaliente");
        }
        else if (nota == 10) {
            System.out.println("Matricula");
        }
        else{
            System.out.println("Introduce una nota entre 0 y 10.");
        }
    }
}
