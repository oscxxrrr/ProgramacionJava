package Simulacro01;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Simulacro03 {
    public static void main(String[] args) {
        try {
            Consola consola1 = new Consola();
            consola1.setTitulo("Simulacro2");

            CapaFondo capaFondo1 = consola1.getCapaFondo();
            Teclado teclado1 = consola1.getTeclado();
            CapaTexto capaTexto1 = consola1.getCapaTexto();

            File imagen = new File("C:\\Users\\usuario\\Downloads\\fondopantalla.jpg");
            BufferedImage img = ImageIO.read(imagen);
            FondoImagen fondo1 = new FondoImagen(img);
            boolean ajustar = true;
            fondo1.setEscalado(ajustar);
            capaFondo1.setFondo(fondo1);
            capaTexto1.setColorTexto(Color.RED);
            capaTexto1.print(30,57,"Para salir pulse cualquier tecla");
            teclado1.leerCaracter();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
