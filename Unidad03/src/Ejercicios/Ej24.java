package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import java.awt.*;
import java.util.Random;

public class Ej24 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaCanvas canvas = consola.getCapaCanvas();
        Graphics graphics = canvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        Random random = new Random();

        int ancho = (int) dimension.getWidth();
        int alto = (int) dimension.getHeight();

        int x = ancho / 2;
        int y = alto / 2;

        for (int i = 0; i < 5000000; i++) {
            boolean moverXArriba = random.nextBoolean();
            boolean moverYArriba = random.nextBoolean();

            if (moverXArriba) {
                x++;
            } else {
                x--;
            }

            if (moverYArriba) {
                y++;
            } else {
                y--;
            }

            if (x < 0){
                x = 0;
            }
            if (x > ancho){
                x = ancho;
            }
            if (y < 0){
                y = 0;
            }
            if (y > alto){
                y = alto;
            }

            graphics.setColor(Color.RED);
            graphics.fillOval(x, y, 4, 4);

        }
    }
}
