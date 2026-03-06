import jd.personajes.lib.Habitacion;
import jd.personajes.lib.Mansion;
import jd.personajes.lib.Persona;
import jd.personajes.lib.Posicion;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

public class CamaraSeguimiento implements Camara{
    private Estado estado;
    private Persona persona;
    public CamaraSeguimiento(Persona p){
        this.persona = p;
        this.estado = Estado.APAGADA;
    }


    @Override
    public void encender() {
        this.estado = Estado.ENCENDIDA_OK;
    }

    @Override
    public void apagar() {
        this.estado = Estado.APAGADA;
    }

    @Override
    public void reparar() {
        this.reparar();
    }

    @Override
    public Estado getEstado() {
        return this.estado;
    }

    @Override
    public String getObjetivo() {
        return this.persona.getNombre().name();
    }

    @Override
    public BufferedImage getImagenEncendida(LocalDateTime momento) {
        Habitacion hab = persona.getPosicion(momento).getHabitacion();
        CamaraHabitacion cam = new CamaraHabitacion(hab, true, false);
        return cam.getImagen(momento);
    }
}
