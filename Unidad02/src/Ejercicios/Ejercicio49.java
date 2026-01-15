package Ejercicios;

import daw.efectoimagen.EfectoBuilder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        System.out.println("Introduce la ruta de tu imagen: ");
        String ruta = new Scanner(System.in).nextLine();
        File file = new File(ruta);
        try {
            BufferedImage img = ImageIO.read(file);
            EfectoBuilder efectoBuilder = new EfectoBuilder(img);
            efectoBuilder.aplicarEfecto(EfectoBuilder.INVERTIR);
            efectoBuilder.aplicarEfecto(EfectoBuilder.BLURRED);
            efectoBuilder.aplicarEfecto(EfectoBuilder.ESCALA_GRISES);

            efectoBuilder.build();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
