package com.Calculadora;

public class Calculadora {
    public static int sumar(int a, int b){
        return a + b;
    }
    public static int restar(int a, int b){
        return a-b;
    }
    public static int dividir(int a, int b){
        int resultado = 0;
        if (b!=0){
            resultado = a/b;
        }else {
            throw new IllegalArgumentException("No se puede dividir un numero por 0");
        }
        return resultado;
    }
    public static int inverso(int a){
        return Calculadora.dividir(1,a);
    }
}
