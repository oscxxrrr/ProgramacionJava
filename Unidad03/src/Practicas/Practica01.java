package Practicas;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Practica01 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaFondo fondo = consola.getCapaFondo();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();

        try {
            texto.printct(10, "Introduce la ruta de la imagen para el fondo de pantalla: ");
            String ruta = teclado.leerCadenaCaracteres();
            File file = new File(ruta);
            BufferedImage img = ImageIO.read(file);
            FondoImagen fondoImagen = new FondoImagen(img);
            fondoImagen.setEscalado(true);
            fondo.setFondo(fondoImagen);
            boolean repetir = true;
            while (repetir) {
                texto.cls();
                texto.setColorFondo(Color.black);
                texto.setColorTexto(Color.YELLOW);
                texto.printct(15, "¿Quieres añadir otra foto diferente? (s/n): ");
                char opcion = teclado.leerCaracter();

                if (opcion == 's' || opcion == 'S') {
                    texto.cls();
                    texto.printct(10, "Introduce la ruta de la nueva imagen: ");
                    String ruta2 = teclado.leerCadenaCaracteres();
                    File file2 = new File(ruta2);
                    BufferedImage img2 = ImageIO.read(file2);
                    FondoImagen fondoImagen2 = new FondoImagen(img2);
                    fondoImagen2.setEscalado(true);
                    fondo.setFondo(fondoImagen2);
                } else if (opcion == 'n' || opcion == 'N') {
                    texto.cls();
                    texto.printct(15, "Pulse cualquier tecla para salir");
                    teclado.setVisible(false);
                    teclado.leerCaracter();
                    repetir = false;
                }
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
