package practicar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prac04 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Introduce un numero: ");
        int numero = new Scanner(System.in).nextInt();

        for (int i = 1; i <= numero; i++) {
            numeros.add(i);
            numeros.add(i-i*2);
        }
        System.out.println(numeros);

    }
}
