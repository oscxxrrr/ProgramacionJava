package Ejercicios;

import bpc.daw.objetos.DepositoAgua;
import java.util.Random;

public class Ej15 {
    public static void main(String[] args) {
        Random random = new Random();
        int n1 = random.nextInt(0, 1000);
        int n2 = random.nextInt(0, 1000);
        DepositoAgua deposito1 = new DepositoAgua(1000, n1);
        DepositoAgua deposito2 = new DepositoAgua(1000, n2);

        System.out.println("Cantidad inicial d1: " + n1);
        System.out.println("Cantidad inicial d2: " + n2);
        int cont = 0;

        boolean repetir = true;

        while (repetir) {
            if (n1 > n2) {
                int calculos = n1 - n2;
                while (cont != calculos) {
                    deposito1.retirarLitro();
                    deposito2.añadirLitro();
                    cont++;
                }
                repetir = false;
                System.out.println("Cantidad movida del d1 al d2: " + calculos);
            } else if (n2 > n1) {
                int calculos = n2 - n1;
                while (cont != calculos) {
                    deposito2.retirarLitro();
                    deposito1.añadirLitro();
                    cont++;
                }
                repetir = false;
                System.out.println("Cantidad movida del d2 al d1: " + calculos);
            } else {
                System.out.println("Depósitos iguales desde un principio");
                repetir = false;
            }
        }

        System.out.println("Cantidad final d1: " + deposito1.getCantidadActual());
        System.out.println("Cantidad final d2: " + deposito2.getCantidadActual());
    }
}
