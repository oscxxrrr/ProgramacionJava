package Simulacro03;

import bpc.daw.consola.*;

import java.awt.*;

public class ej2 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Teclado teclado = consola.getTeclado();

        graphics.drawLine(250,46,196,180);
        graphics.drawLine(196,180,446,224);
        graphics.drawLine(446,224,297,268);
        graphics.drawLine(297,268,250,400);
        graphics.drawLine(250,400,203,268);
        graphics.drawLine(203,268,53,224);
        graphics.drawLine(53,224,202,180);
        graphics.drawLine(202,180,250,46);


        teclado.setVisible(false);
        teclado.leerCaracter();

    }
}
