package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;

import java.awt.*;
import java.util.Random;

public class Ej47 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int altura = (int)dimension.getHeight();
        int ancho = (int)dimension.getWidth();
        Graphics graphics = capaCanvas.getGraphics();
        Random random = new Random();

        for (int i = 0; i <= ancho; i+=50) {
            int g = random.nextInt(0,256);
            int r = random.nextInt(0,256);
            int b = random.nextInt(0,256);
            Color color = new Color(r,g,b);
            graphics.setColor(color);
            for (int j = 0; j <= ancho; j+=50) {
                graphics.drawLine(i,0,j,altura);
            }
        }
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
