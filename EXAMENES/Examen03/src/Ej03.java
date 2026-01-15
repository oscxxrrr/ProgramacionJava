import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.Random;

public class Ej03 {
    public static void main(String[] args) {
        final int ALTURA = 100;
        Consola consola = new Consola();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Teclado teclado = consola.getTeclado();

        int anchuraPrimero = new Random().nextInt(10, 801);

        for (int i = 0; i < 10; i++) {
            int anchura;
            if (i == 0) {
                anchura = anchuraPrimero;
            } else {
                anchura = new Random().nextInt(10, anchuraPrimero + 1);
                anchuraPrimero = anchura;
            }
            int r = new Random().nextInt(256);
            int g = new Random().nextInt(256);
            int b = new Random().nextInt(256);

            graphics.setColor(new Color(r, g, b));
            graphics.fillRect(0, i * ALTURA, anchura, ALTURA);
        }
        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
