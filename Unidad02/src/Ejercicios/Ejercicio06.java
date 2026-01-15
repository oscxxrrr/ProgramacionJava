package Ejercicios;
import bpc.daw.mario.*;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args){
        System.out.println("Introduce la coordenada X: ");
        int x = new Scanner(System.in).nextInt();
        System.out.println("Introduce la coordenada Y: ");
        int y = new Scanner(System.in).nextInt();

        Mario mario1 = new Mario(x, y);
    }
}
