package Ejercicios;
import bpc.daw.objetos.DepositoAgua;
public class Ejercicio07 {
    public static void main(String[] args){
        DepositoAgua deposito1 = new DepositoAgua(15, 50);
        int capacidadActual = deposito1.getCantidadActual();
        int capacidadMaxima = deposito1.getCapacidadMaxima();
        double total = capacidadMaxima * 100.0 / capacidadActual;
        deposito1.dibujar();
        System.out.println("El porcentaje es: " + total);
    }
}
