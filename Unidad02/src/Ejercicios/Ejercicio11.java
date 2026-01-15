package Ejercicios;
import bpc.daw.objetos.Caja;
public class Ejercicio11 {
    public static void main(String[] args){
        Caja caja1 = new Caja("Caja 1");
        Caja caja2 = new Caja("Caja 2");
        caja1.abrirCaja();
        caja2.abrirCaja();
        String mensaje1 = caja1.getMensaje();
        String mensaje2 = caja2.getMensaje();

        caja1.cambiarMensaje(mensaje2);
        caja2.cambiarMensaje(mensaje1);

        String mensaje1Cambiado = caja1.getMensaje();
        String mensaje2Cambiado = caja2.getMensaje();

        System.out.println("Original 1: " + mensaje1 + "\nOriginal 2: " + mensaje2 + "\nCambiado 1: " + mensaje1Cambiado + "\nCambiado 2: " + mensaje2Cambiado);
    }
}
