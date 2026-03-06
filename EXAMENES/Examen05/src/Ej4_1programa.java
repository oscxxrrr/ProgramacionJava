import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import jd.personajes.lib.Habitacion;
import jd.personajes.lib.Mansion;
import jd.personajes.lib.NombreHabitacion;

import java.awt.*;
import java.time.LocalDateTime;

public class Ej4_1programa {
    public static void main(String[] args) {
        Consola consola = new Consola("EXAMEN 5", Camara.ANCHO_CAMARA, Camara.ALTO_CAMARA);
        Habitacion hab = Mansion.getHabitacion(NombreHabitacion.COCINA);
        CamaraHabitacion camaraHabitacion = new CamaraHabitacion(hab, false,true);
        camaraHabitacion.encender();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Teclado teclado = consola.getTeclado();
        Graphics graphics = capaCanvas.getGraphics();
        graphics.drawImage(camaraHabitacion.getImagenAveriada(), 0,0,null );




        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
