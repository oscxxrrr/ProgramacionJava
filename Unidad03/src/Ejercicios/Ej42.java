package Ejercicios;

public class Ej42 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("Tabla del " + i + ":");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " X " + j +" = "+i * j);
            }
            System.out.println("\n");
        }
    }
}
