package Ejercicios;

public class Ejercicio41 {
    public static void main(String[] args) {
        double n1 = (0.38 * 4.93);
        double n2 = -0.36;
        double resultado = Math.pow(n1, n2);
        int redondeado = (int) Math.round(resultado);
        System.out.println("Resultado = " + resultado + "\nRedondeado al numero entero mas cercano es: " + redondeado);
    }
}
