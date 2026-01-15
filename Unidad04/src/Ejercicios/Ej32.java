package Ejercicios;

public class Ej32 {
    public static void main(String[] args) {
        Integer[] numeros = {50, 26, 7, 9, 15, 27};
        for (int i = 0; i < numeros.length; i++) {
            int min = numeros[i];
            int pos = i;
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] < min){
                    min = numeros[i];
                    pos = j;
                }
            }
            int aux = min;

        }
    }
}
