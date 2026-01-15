package Ejercicios;

public class Ej16 {
    public static void main(String[] args) {
        int[] numeros = {2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            suma = suma + numero;
        }
        System.out.println("La suma de todos los numeros es: " + suma);
    }
}
