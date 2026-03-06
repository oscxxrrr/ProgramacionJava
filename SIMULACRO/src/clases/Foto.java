package clases;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public record Foto(String nombre, int ancho, int alto, Tamaño tamaño, Image imagen) {
    public Foto {
        if (ancho < 0 || alto < 0) {
            throw new IllegalArgumentException("Medidias incorrectas");
        }
        if (imagen == null) {
            throw new IllegalArgumentException("La imagen es null");
        }
    }

    public Foto(String nombre, Image imagen) {
        this(nombre, imagen.getWidth(null), imagen.getHeight(null), Tamaño.getTamaño(imagen.getWidth(null), imagen.getHeight(null)), imagen);
    }

    public boolean mayorQue(Foto f) {
        boolean resultado;
        if (f.ancho > this.ancho && f.alto > this.ancho) {
            resultado = false;
        } else {
            resultado = true;
        }
        return resultado;
    }

    public Foto toBlancoNegro() {
        BufferedImage bf = new BufferedImage(this.imagen.getWidth(null), this.imagen.getHeight(null),BufferedImage.TYPE_BYTE_GRAY);
        Graphics graphics = bf.getGraphics();
        graphics.drawImage(this.imagen,0,0,this.imagen.getWidth(null),this.imagen.getHeight(null),null);
        return new Foto(this.nombre,bf);
    }

    public static Foto cargarFoto(String ruta) throws IOException {
        File file = new File(ruta);
        BufferedImage img = ImageIO.read(new File(file + ".jpg"));
        String nombre = file.getName();
        return new Foto(nombre, img);
    }
}
