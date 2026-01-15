package Simulacro01;
import bpc.daw.consola.*;

import java.awt.*;

public class Simulacro07 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        consola.setTitulo("Simulacro 7");
        Teclado teclado = consola.getTeclado();

        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        int width = (int)dimension.getWidth();
        int height = (int)dimension.getHeight();

        graphics.setColor(Color.RED);
        graphics.drawLine(0,0,width,height);
        graphics.setColor(Color.GREEN);
        graphics.drawLine(width,0,0,height);

        graphics.setColor(Color.BLUE);
        graphics.drawOval(width/2 - 50,height/2-50, 100,100);

        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
