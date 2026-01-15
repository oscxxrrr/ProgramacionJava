package Ejercicios;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Ej09 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaFondo fondo = consola.getCapaFondo();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();

        try {
            char opcion;
            do {
                texto.cls();
                texto.printct(10, "Introduce la ruta de la imagen para el fondo de pantalla: ");
                String ruta = teclado.leerCadenaCaracteres();
                File file = new File(ruta);
                BufferedImage img = ImageIO.read(file);
                FondoImagen fondoImagen = new FondoImagen(img);
                fondoImagen.setEscalado(true);
                fondo.setFondo(fondoImagen);

                texto.cls();
                texto.setColorFondo(Color.black);
                texto.setColorTexto(Color.YELLOW);
                texto.printct(15, "¿Quieres añadir otra foto diferente? (s/n): ");
                opcion = teclado.leerCaracter();
            } while (opcion == 's' || opcion == 'S');

            teclado.setVisible(false);
            teclado.leerCaracter();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
