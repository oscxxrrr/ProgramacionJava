package Ejercicios;
import bpc.daw.objetos.DepositoAgua;
public class Ejercicio08 {
    public static void main(String[] args){
        DepositoAgua deposito1 = new DepositoAgua(15, 20);
        DepositoAgua deposito2 = new DepositoAgua(5, 20);

        deposito1.dibujar();
        deposito2.dibujar();

        deposito2.retirarLitro();
        deposito2.retirarLitro();
        deposito2.retirarLitro();
        deposito2.retirarLitro();
        deposito2.retirarLitro();

        deposito1.añadirLitro();
        deposito1.añadirLitro();
        deposito1.añadirLitro();
        deposito1.añadirLitro();
        deposito1.añadirLitro();

        deposito1.dibujar();
        deposito2.dibujar();
    }
}
