import bpc.daw.consola.CapaCanvas;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public interface Camara {
    public static final int ANCHO_CAMARA = 400;
    public static final int ALTO_CAMARA = 256;

    public abstract void encender();
    public abstract void apagar();
    public abstract void reparar();
    public abstract Estado getEstado();
    public abstract String getObjetivo();
    public abstract BufferedImage getImagenEncendida(LocalDateTime momento);
    public default BufferedImage getImagenApagada(){
        return Camara.getImagenNegra(Camara.ANCHO_CAMARA,Camara.ALTO_CAMARA);
    }

    public default BufferedImage getImagenAveriada(){
        BufferedImage bf = this.getImagenApagada();
        Graphics graphics = bf.getGraphics();
        int random = new Random().nextInt(1,6);
        for (int i = 0; i < random; i++) {
            graphics.setColor(Color.GRAY);
            graphics.fillRect(0, new Random().nextInt(Camara.ALTO_CAMARA), Camara.ANCHO_CAMARA, 30);
            graphics.drawImage(bf, 0,0,Camara.ANCHO_CAMARA,Camara.ALTO_CAMARA, null);
        }
        return bf;
    }

    public default BufferedImage getImagen(LocalDateTime momento){
        BufferedImage bf;
        if (this.getEstado().estaEncendido()){
            bf = this.getImagenEncendida(momento);
            Graphics graphics = bf.getGraphics();
        }else {
            bf = this.getImagenApagada();
        }
        return bf;
    }

    public default boolean estaEncendida(){
        return this.getEstado().estaEncendido();
    }

    public static BufferedImage getImagenNegra(int ancho, int alto){
        BufferedImage bf = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = bf.getGraphics();
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,ancho,alto);
        graphics.drawImage(bf, 0,0,ancho,alto, null);
        return bf;
    }
}
