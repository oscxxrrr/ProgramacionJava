package Ejercicios;

import bpc.daw.objetos.DepositoAgua;

public class Ej19 {
    public static void main(String[] args) {
        DepositoAgua depositoAgua = new DepositoAgua(0, 1000);
        depositoAgua.dibujar();
        for (int i = 0; i < depositoAgua.getCapacidadMaxima(); i++) {
            depositoAgua.añadirLitro();
        }
        depositoAgua.dibujar();
    }
}
