package PRACTICA_EXAMEN;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ej8 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        Graphics g = consola.getCapaCanvas().getGraphics();
        CapaTexto capaTexto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        teclado.setVisible(false);
        capaTexto.println("Pulsa una tecla para intercambiar las fotografías");
        try {
            File file1 = new File("coche1.jpg");
            BufferedImage bf = ImageIO.read(file1);
            g.drawImage(bf,0,50,null);
            File file2 = new File("coche2.jpg");
            BufferedImage bf2 = ImageIO.read(file2);
            g.drawImage(bf2,1050,50,null);

            teclado.leerCaracter();
            capaTexto.cls();
            consola.getCapaCanvas().cls();

            capaTexto.println("Pulsa una tecla para salir");
            g.drawImage(bf2,0,50,null);
            g.drawImage(bf,750,50,null);

            teclado.leerCaracter();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
