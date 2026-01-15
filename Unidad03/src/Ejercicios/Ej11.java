package Ejercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ej11 {
    public static void main(String[] args) {
        boolean repetir = true;
        System.out.println("Introduce una frase: ");
        String frase = new Scanner(System.in).nextLine();
        StringTokenizer t1 = new StringTokenizer(frase, " ");
        int cont = 0;
        while (repetir){
            if (t1.hasMoreTokens()){
                String imprimir = t1.nextToken();
                System.out.println(imprimir);
                cont++;
            } else {
                repetir = false;
            }
        }
        System.out.println("Numero de palabras: " + cont);
    }
}
