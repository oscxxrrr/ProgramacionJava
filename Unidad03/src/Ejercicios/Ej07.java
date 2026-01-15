package Ejercicios;

import java.util.Random;
import bpc.daw.objetos.*;

public class Ej07 {
    public static void main(String[] args) {
        Random random = new Random();
        int cont = 0;
        int capacidad = random.nextInt(100);
        DepositoAgua depositoAgua = new DepositoAgua(100, capacidad);
        int maximo = 100 - capacidad;
        while (cont<maximo){
            cont++;
            depositoAgua.añadirLitro();
        }
        System.out.println("Capacidad total: "+100+"\nCapacidad inicial: " + depositoAgua.getCapacidadMaxima() + "\nHemos tenido que llenar " + cont);
    }
}
