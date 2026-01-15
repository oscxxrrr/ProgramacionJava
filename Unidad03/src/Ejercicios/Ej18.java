package Ejercicios;

import bpc.daw.consola.*;

import java.awt.*;
import java.util.Random;

public class Ej18 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        Random random = new Random();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Teclado teclado = consola.getTeclado();
        teclado.setVisible(false);

        for (int i = 0; i < 8; i++) {

            //COORDENADA ALEATORIA
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimensiones = toolkit.getScreenSize();
            int coordenadaMaxX = (int)dimensiones.getWidth();
            int coordenadaMaxY = (int)dimensiones.getHeight();
            int coordenadaXrandom = random.nextInt(0,coordenadaMaxX);
            int coordenadaYrandom = random.nextInt(0,coordenadaMaxY);

            //COLOR ALEATORIO
            int r = random.nextInt(0,256);
            int g = random.nextInt(0,256);
            int b = random.nextInt(0,256);
            Color color = new Color(r,g,b);

            //TAMAÑO ALEATORIO
            int anchuraRect = random.nextInt(0,500);
            int alturaRect = random.nextInt(0,500);
            graphics.setColor(color);
            graphics.fillRect(coordenadaXrandom, coordenadaYrandom, anchuraRect, alturaRect);
        }


        teclado.leerCaracter();

    }
}
