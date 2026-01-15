package Ejercicios;
import bpc.daw.mario.*;
public class Ejercicio05 {
    public static void main(String[] args){
        Cañon cañon1 = new Cañon(600, 500);
        Cañon cañon2 = new Cañon(650, 500);

        cañon1.disparar(600, 600);
        cañon1.disparar(600, 650);

        cañon2.disparar(650, 700);
        cañon2.disparar(650, 750);
        cañon2.disparar(650, 800);

        System.out.println("El cañon 1 ha disparado: " + cañon1.getTotalDisparosRealizados());
        System.out.println("El cañon 2 ha disparado: " + cañon2.getTotalDisparosRealizados());
    }
}
