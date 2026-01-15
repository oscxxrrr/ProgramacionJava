package Ejercicios;
import bpc.daw.objetos.Caja;
public class Ejercicio09 {
    public static void main(String[] args){
        Caja caja1 = new Caja("Bienvenidos al instituto");
        String mensaje1 = caja1.getMensaje();
        caja1.abrirCaja();
        String mensaje2 = caja1.getMensaje();
        System.out.println(mensaje1 + "\n" + mensaje2);
    }
}
