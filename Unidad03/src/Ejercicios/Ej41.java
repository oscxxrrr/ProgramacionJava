package Ejercicios;

import bpc.daw.consola.*;
import java.awt.*;

public class Ej41 {
    public static void main(String[] args) {

        Consola consola = new Consola();
        CapaCanvas canvas = consola.getCapaCanvas();
        Graphics g = canvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension pantalla = toolkit.getScreenSize();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();

        int ancho = (int)pantalla.getWidth();
        int alto = (int)pantalla.getHeight();

        texto.print("Introduce un número N para crear una cuadrícula: ");
        int n = teclado.leerNumeroEntero();
        int tamX = ancho / n;
        int tamY = alto / n;
        for (int i = 0; i <= n; i++) {
            int x = i * tamX;
            int y = i * tamY;
            g.drawLine(x, 0, x, alto);
            g.drawLine(0, y, ancho, y);
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
