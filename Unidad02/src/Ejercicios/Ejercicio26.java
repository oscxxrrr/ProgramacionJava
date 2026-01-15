package Ejercicios;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Introduce los segundos que quieres esperar: ");
        long segundos = new Scanner(System.in).nextInt();

        try {
            Thread.sleep(segundos * 1000);
            System.out.println("Fin del programa, ya han pasado los " + segundos + " milisegundos.");
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("No se puedes poner numeros negativos");
        }
    }
}
