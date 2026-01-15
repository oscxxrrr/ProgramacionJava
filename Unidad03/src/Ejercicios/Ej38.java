package Ejercicios;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Ej38 {
    public static void main(String[] args) {
        try {
            Consola consola = new Consola();
            CapaTexto texto = consola.getCapaTexto();
            CapaFondo capaFondo = consola.getCapaFondo();
            Teclado teclado = consola.getTeclado();
            CapaCanvas capaCanvas = consola.getCapaCanvas();
            Graphics graphics = capaCanvas.getGraphics();
            texto.printct(15,"Introduce la ruta de tu imagen para ponerla de fondo de pantalla: ");
            String ruta = teclado.leerCadenaCaracteres() + ".jpg";
            texto.cls();
            File file = new File(ruta);
            BufferedImage bf = ImageIO.read(file);
            FondoImagen imagen = new FondoImagen(bf);
            imagen.setEscalado(true);

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            int altura = (int)dimension.getHeight();
            int ancho = (int)dimension.getWidth();

            for (int i = 0; i < altura; i+=10) {
                graphics.setColor(Color.BLACK);
                graphics.drawLine(0, i, ancho, i);
            }


            capaFondo.setFondo(imagen);
            teclado.setVisible(false);
            teclado.leerCaracter();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
