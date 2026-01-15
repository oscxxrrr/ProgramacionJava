package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class Ej14 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Teclado teclado = consola.getTeclado();;

        int[] listaX = {250,300,446,297,250,203,53,202};
        int[] listaY = {46,180,224,268,400,268,224,180};

        graphics.drawPolygon(listaX,listaY,8);

        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
