package PRACTICA_EXAMEN;

import bpc.daw.consola.*;

import java.awt.*;

public class ej7 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graficos = capaCanvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        Dimension dimesiones = toolkit.getScreenSize();
        int altura = (int)dimesiones.getHeight();
        int anchura = (int)dimesiones.getWidth();

        graficos.setColor(Color.RED);
        graficos.drawLine(0,0,anchura,altura);
        graficos.setColor(Color.GREEN);
        graficos.drawLine(anchura,0,0,altura);
        graficos.setColor(Color.BLUE);
        graficos.drawOval(anchura/2-150,altura/2-150,300,300);

        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
