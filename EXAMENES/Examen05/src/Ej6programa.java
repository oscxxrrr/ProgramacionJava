import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import jd.personajes.lib.Mansion;
import jd.personajes.lib.NombrePersonaje;
import jd.personajes.lib.Persona;
import jd.personajes.lib.Personajes;

import java.awt.*;
import java.time.LocalDateTime;

public class Ej6programa {
    public static void main(String[] args) {
        Persona persona = Personajes.getPersona(NombrePersonaje.MAX);
        CamaraSeguimiento camaraSeguimiento = new CamaraSeguimiento(persona);
        camaraSeguimiento.encender();

        Consola consola = new Consola();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        graphics.drawImage(camaraSeguimiento.getImagen(LocalDateTime.now()), 0,0,null);
        Teclado teclado = consola.getTeclado();
        teclado.leerCaracter();
    }
}
