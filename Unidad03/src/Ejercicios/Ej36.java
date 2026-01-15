package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import java.awt.*;

public class Ej36 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        int ancho = (int)dimension.getWidth();
        int altura = (int)dimension.getHeight();

        for (int i = 0; i < ancho; i+=50) {
            graphics.drawLine(i,0,ancho, i);

        }
        int ladoCuadrado = altura -50;
        graphics.drawRect(25,25,ladoCuadrado,ladoCuadrado);
        for (int i = 25; i < ladoCuadrado && i<=altura; i+=50) {
            graphics.drawLine(i,25,ladoCuadrado+25, i);

        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
