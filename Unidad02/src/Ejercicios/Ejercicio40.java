package Ejercicios;

public class Ejercicio40 {
    public static void main(String[] args) {
        Runtime runtime1 = Runtime.getRuntime();
        int cantidadProcesadores = runtime1.availableProcessors();
        long memoriaTotal = runtime1.totalMemory();
        System.out.println("Numero procesadores: " + cantidadProcesadores + "\nMemoria total: " + memoriaTotal);
    }
}


