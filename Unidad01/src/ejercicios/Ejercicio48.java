package ejercicios;

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args){
        int dni = 0;
        System.out.println("Introduce tu numero DNI y te digo la letra que corresponde: ");
        dni = new Scanner(System.in).nextInt();

        double calculo = dni % 23.0;
        if(calculo == 0){
            System.out.println(dni+"T");
        } else if (calculo == 1) {
            System.out.println(dni+"R");
        } else if (calculo == 2) {
            System.out.println(dni+"W");
        } else if (calculo == 4) {
            System.out.println(dni+"A");
        } else if (calculo == 5) {
            System.out.println(dni+"M");
        }else if (calculo == 6) {
            System.out.println(dni+"Y");
        }else if (calculo == 7) {
            System.out.println(dni+"F");
        }else if (calculo == 8) {
            System.out.println(dni+"P");
        }else if (calculo == 9) {
            System.out.println(dni+"D");
        }else if (calculo == 10) {
            System.out.println(dni+"X");
        }else if (calculo == 11) {
            System.out.println(dni+"B");
        }else if (calculo == 12) {
            System.out.println(dni+"N");
        }else if (calculo == 13) {
            System.out.println(dni+"J");
        }else if (calculo == 14) {
            System.out.println(dni+"Z");
        }else if (calculo == 15) {
            System.out.println(dni+"S");
        }else if (calculo == 16) {
            System.out.println(dni+"Q");
        }else if (calculo == 17) {
            System.out.println(dni+"V");
        }else if (calculo == 18) {
            System.out.println(dni+"H");
        }else if (calculo == 19) {
            System.out.println(dni+"L");
        }else if (calculo == 20) {
            System.out.println(dni+"C");
        }else if (calculo == 21) {
            System.out.println(dni+"K");
        }else if (calculo == 22) {
            System.out.println(dni+"E");
        }else if (calculo == 23) {
            System.out.println(dni+"T");
        }
    }
}
