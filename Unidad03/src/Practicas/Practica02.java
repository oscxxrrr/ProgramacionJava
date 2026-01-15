package Practicas;

import java.util.Scanner;

public class Practica02 {
    public static void main(String[] args) {
        System.out.println("Introduce numero de aciertos: ");
        int aciertos = new Scanner(System.in).nextInt();

        int premio = switch (aciertos){
            case 7 -> 100;
            case 8 -> 200;
            case 9 -> 300;
            default -> 0;
        };
        System.out.println(premio);
    }
}
