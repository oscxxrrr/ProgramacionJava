package Ejercicios;
import bpc.daw.objetos.Caja;

public class Ejercicio10 {
    public static void main(String[] args){
        Caja caja1 = new Caja("Este es el mensaje de la Caja 1");
        caja1.abrirCaja();
        String mensaje1 = caja1.getMensaje();

        System.out.println("Mensaje original: " + mensaje1);
        caja1.cambiarMensaje("Este es el nuevo mensaje de la Caja 1");
        String mensaje2 = caja1.getMensaje();
        System.out.println("Mensaje editado: " + mensaje2);
    }
}
