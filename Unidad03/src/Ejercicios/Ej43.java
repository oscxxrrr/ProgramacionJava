package Ejercicios;

import java.util.Scanner;

public class Ej43 {
    public static void main(String[] args) {
        boolean repetir = true;
        int cont = 0;
        int suma = 0;
        while (repetir && cont != 10){
            System.out.println("Introduce una nota: ");
            int nota = new Scanner(System.in).nextInt();
            cont++;
            if (nota > 10 || nota < 0){
                cont--;
            }else {
                suma+=nota;
            }
        }
        double media = (double) suma / 10;
        System.out.println(media);
    }
}
