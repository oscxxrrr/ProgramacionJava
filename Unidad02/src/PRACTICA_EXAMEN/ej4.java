package PRACTICA_EXAMEN;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ej4 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        CapaFondo fondo = consola.getCapaFondo();
        Teclado teclado = consola.getTeclado();

        texto.setColorTexto(Color.YELLOW);
        FondoColorSolido fondoColorSolido = new FondoColorSolido(Color.blue);
        fondo.setFondo(fondoColorSolido);
        texto.print(30,50,"Pulse cualquier tecla para salir");
        texto.printct(10,"Introduce una ruta para añadir una foto de fondo: ");
        String ruta = teclado.leerCadenaCaracteres();
        File file = new File(ruta);
        try {
            BufferedImage bf = ImageIO.read(file);
            FondoImagen imagen = new FondoImagen(bf);
            imagen.setEscalado(true);
            fondo.setFondo(imagen);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
