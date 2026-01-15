package PRACTICA_EXAMEN;

import bpc.daw.consola.*;

import java.awt.*;

public class ej5 {
    public static void main(String[] args) {
        Consola consola = new Consola("ej5",640,480);
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graficos = capaCanvas.getGraphics();

        graficos.setColor(Color.CYAN);
        graficos.fillRect(0,0,640,400);
        graficos.setColor(Color.GREEN);
        graficos.fillRect(0,400,640,80);
        graficos.setColor(Color.YELLOW);
        graficos.fillOval(120,90,100,100);


        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
