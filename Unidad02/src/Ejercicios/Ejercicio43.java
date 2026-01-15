package Ejercicios;

import java.text.NumberFormat;

public class Ejercicio43 {
    public static void main(String[] args) {
        double pi = Math.PI;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(4);
        System.out.println(numberFormat.format(pi));
    }
}
