package clases;

import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        try {
            Foto foto = Foto.cargarFoto("foto1");
            foto = foto.toBlancoNegro();
            ImageIO.write((RenderedImage) foto.imagen(),"png",new File("blanco_negro.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
