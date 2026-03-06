import jd.personajes.lib.Habitacion;
import jd.personajes.lib.Personajes;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.util.Random;

public class CamaraHabitacion implements Camara{
    private  boolean encendido;
    private boolean averiado;
    private Habitacion habitacion;

    public CamaraHabitacion(Habitacion h){
        this.habitacion = h;
        this.encendido = false;
        int rand = new Random().nextInt(1,11);
        if (rand>7){
            this.averiado = true;
        }else {
            this.averiado = false;
        }
    }

    public CamaraHabitacion(Habitacion h, boolean e, boolean a){
        this.habitacion = h;
        this.encendido = e;
        this.averiado = a;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
    }

    @Override
    public void reparar() {
        if (averiado){
            this.averiado = false;
        }
    }

    @Override
    public Estado getEstado() {
        return Estado.ENCENDIDA_OK;
    }

    @Override
    public String getObjetivo() {
        return this.habitacion.getNombre().name();
    }

    @Override
    public BufferedImage getImagenEncendida(LocalDateTime momento) {
        BufferedImage bf = Camara.getImagenNegra(400,256);
        Graphics graphics = bf.getGraphics();
        graphics.drawImage(this.habitacion.getImagen(), 0,0,null);

        return bf;
    }
}
