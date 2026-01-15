package Ejercicios;

import bpc.daw.objetos.TarjetaCredito;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        TarjetaCredito tarjeta1 = new TarjetaCredito(1000, 2222);
        System.out.println("Introduce la contraseña:");
        int pass = new Scanner(System.in).nextInt();

        try {
            int saldo = tarjeta1.getSaldo(pass);
            System.out.println("El saldo actual es: " + saldo);
            tarjeta1.ingresarDinero(100);
            saldo = tarjeta1.getSaldo(pass);
            System.out.println("El saldo despues de introducir 100€ es: " + saldo);

            boolean sacar = tarjeta1.sacarDinero(2800, pass);
            if(sacar){
                saldo = tarjeta1.getSaldo(pass);
                System.out.println("Despues de sacar 2800€ es: " + saldo);
            }else {
                System.out.println("No hay saldo suficiente ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
