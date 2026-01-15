package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;

public class Ej24 {
    public static void main(String[] args) {

        Consola consola = new Consola();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Teclado teclado = consola.getTeclado();
        CapaTexto texto = consola.getCapaTexto();
        Graphics graphics = capaCanvas.getGraphics();

        texto.printct(12,"Introduce el numero de vertices: ");
        int numVert = teclado.leerNumeroEntero();
        texto.cls();

        int[] x = new int[numVert];
        int[] y = new int[numVert];

        for (int i = 0; i < numVert; i++) {
            texto.printct(10,"Introduce la cordenada X: ");
            int cordenadaX = teclado.leerNumeroEntero();
            texto.printct(15,"Introduce la cordenada Y: ");
            int cordenadaY = teclado.leerNumeroEntero();
            x[i] = cordenadaX;
            y[i] = cordenadaY;
            texto.cls();
        }

        graphics.drawPolygon(x,y,numVert);

        teclado.leerCaracter();
    }
}
