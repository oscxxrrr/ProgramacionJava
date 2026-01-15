package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.Random;

public class Ej10 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();

        try {
            texto.printct(15, "Introduce el numero de circulos a dibujar: ");
            int numeroCirculos = teclado.leerNumeroEntero();

            if (numeroCirculos > 0) {
                CapaCanvas capaCanvas = consola.getCapaCanvas();
                Graphics graficos = capaCanvas.getGraphics();
                Random random = new Random();
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension pantalla = toolkit.getScreenSize();
                int anchura = (int) pantalla.getWidth();
                int altura = (int) pantalla.getHeight();

                boolean repetir = true;
                int cont = 0;

                while (repetir) {
                    int r = random.nextInt(256);
                    int g = random.nextInt(256);
                    int b = random.nextInt(256);
                    Color color = new Color(r, g, b);

                    int x = random.nextInt(anchura);
                    int y = random.nextInt(altura);
                    int ancho = random.nextInt(anchura);
                    int alto = random.nextInt(altura);

                    texto.cls();
                    graficos.setColor(color);
                    graficos.drawOval(x, y, ancho, alto);

                    cont++;

                    if (cont >= numeroCirculos) {
                        repetir = false;
                    }
                }
            } else {
                texto.cls();
                texto.printct(15, "Numero incorrecto");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
