package PRACTICA_EXAMEN;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ej3 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        CapaFondo capaFondo = consola.getCapaFondo();


        texto.printct(10,"Introduce la ruta de la imagen para ponerla de fondo: ");
        String ruta = teclado.leerCadenaCaracteres();
        texto.cls();
        texto.print(30,57,"Para salir pulse cualquier tecla");
        File file = new File(ruta+".jpg");
        try {
            BufferedImage bf = ImageIO.read(file);
            FondoImagen fondoImagen = new FondoImagen(bf);
            fondoImagen.setEscalado(true);
            capaFondo.setFondo(fondoImagen);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
