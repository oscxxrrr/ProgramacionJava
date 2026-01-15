package Simulacro01;
import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Simulacro04 {
    public static void main(String[] args) {
        try {
            Consola consola1 = new Consola();
            consola1.setTitulo("Simulacro1");

            CapaTexto capaTexto1 = consola1.getCapaTexto();
            CapaFondo capaFondo1 = consola1.getCapaFondo();
            Teclado teclado1 = consola1.getTeclado();
            teclado1.setVisible(false);
            capaTexto1.setColorTexto(Color.YELLOW);
            capaTexto1.print(15,30,"Hola que tal");
            FondoColorSolido fondo1 = new FondoColorSolido(Color.BLUE);

            capaFondo1.setFondo(fondo1);
            capaTexto1.print(3,4,"Introduce la ruta de la imagen para ponerla de fondo de pantalla: ");
            String leerCadena = teclado1.leerCadenaCaracteres();

            File img = new File(leerCadena);
            BufferedImage img2 = ImageIO.read(img);

            FondoImagen fondo2 = new FondoImagen(img2);
            boolean ajustar = true;
            fondo2.setEscalado(ajustar);
            capaFondo1.setFondo(fondo2);
            capaTexto1.setVisible(false);

            teclado1.setVisible(false);
            teclado1.leerCaracter();

        } catch (IOException e  ) {
            System.out.println(e.getMessage());
        }
    }
}
