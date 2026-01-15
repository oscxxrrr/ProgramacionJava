package ejercicios;

import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args){
        System.out.println("Introduce el numero de horas: ");
        int horas = new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de minutos: ");
        int minutos = new Scanner(System.in).nextInt();
        System.out.println("Introduce el numero de segundos: ");
        int segundos = new Scanner(System.in).nextInt();

        int horasAsegundos = horas * 3600;
        int minutosAsegundos = minutos * 60;
        int calculoTotal = segundos + horasAsegundos + minutosAsegundos;

        System.out.println("El total de segundos es: " + calculoTotal + " s");
    }
}
