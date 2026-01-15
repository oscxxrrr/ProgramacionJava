package Ejercicios;

public class Ej32 {
    public static void main(String[] args) {
        double suma = 0;
        for (int i = 5; i <= 13 ; i++) {
            suma = suma + Math.pow(i,2);
        }
        System.out.println("La suma de todas las potencias entre 5 y 13 elevado a dos es de: " + suma);
    }
}
