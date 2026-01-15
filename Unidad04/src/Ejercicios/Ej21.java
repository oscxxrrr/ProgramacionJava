package Ejercicios;

public class Ej21 {
    public static void main(String[] args) {
        int[] numeros = new int[5000];
        for (int i = 0; i < numeros.length; i++) {
            if (i%2==1){
                numeros[i] = 1;
            }
        }
        for(int i: numeros){
            System.out.println(i);
        }
    }
}
