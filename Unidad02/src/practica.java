import bpc.daw.consola.*;

import java.awt.*;

public class practica {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaFondo fondo = consola.getCapaFondo();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Teclado teclado = consola.getTeclado();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucion = toolkit.getScreenSize();
        int altura = (int)resolucion.getHeight();
        int anchura = (int)resolucion.getWidth();

        graphics.setColor(Color.RED);
        graphics.drawLine(0,0, anchura,altura);
        graphics.setColor(Color.BLUE);
        graphics.drawLine(anchura,0, 0,altura);

        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
