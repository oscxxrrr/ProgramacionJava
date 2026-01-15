package Ejercicios;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        double media = 0;
        boolean suspendido = false;
        int cont = 0;

        for (int i = 1; i <= 10 && !suspendido; i++) {
            System.out.println("Introduce una nota: ");
            double nota = new Scanner(System.in).nextInt();
            media = media + nota;
            cont++;
            if (nota < 5){
                suspendido = true;
            }
        }
        if (!suspendido){
            System.out.println("La nota media es: " + media/cont);
        }else {
            System.out.println("Estas suspendido porque hay una nota con nota inferior de 5");
        }
    }
}
