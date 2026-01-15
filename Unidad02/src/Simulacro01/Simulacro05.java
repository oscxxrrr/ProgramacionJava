package Simulacro01;
import bpc.daw.consola.*;

import java.awt.*;

public class Simulacro05 {
    public static void main(String[] args) {
        Consola consola1 = new Consola();
        consola1.setTitulo("Simulacro 5");
        CapaCanvas canvas1 = consola1.getCapaCanvas();
        Graphics graphics = canvas1.getGraphics();
        graphics.setColor(Color.CYAN);
        graphics.fillRect(0,0,640,400);
        graphics.setColor(Color.GREEN);
        graphics.fillRect(0,400,640,80);

        graphics.setColor(Color.YELLOW);
        graphics.fillOval(120,90,60,60);

        Teclado teclado = consola1.getTeclado();
        CapaTexto capaTexto = consola1.getCapaTexto();
        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
