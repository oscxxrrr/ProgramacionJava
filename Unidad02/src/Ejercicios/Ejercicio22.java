package Ejercicios;
import bpc.daw.objetos.TarjetaCredito;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) throws Exception {
        final int CONTRASEÑA = 1111;
        TarjetaCredito tarjeta1 = new TarjetaCredito(5000, CONTRASEÑA);
        System.out.println("Introduce la contraseña:");
        int passIntroducida = new Scanner(System.in).nextInt();

        try {
            int saldo = tarjeta1.getSaldo(passIntroducida);
            System.out.println("El saldo de tu tarjeta es: " + saldo + "€");
            boolean sacarDinero = tarjeta1.sacarDinero(2000, CONTRASEÑA);
            if (sacarDinero) {
                int saldo1 = tarjeta1.getSaldo(passIntroducida);
                System.out.println("Despues de quitarle 2000€ tienes un total de: " +saldo1);
            }
        }catch (Exception e){
            System.out.println(e.getMessage()); //Mensaje predeterminado de la libreria al introducir la contraseña mal.
        }
    }
}
