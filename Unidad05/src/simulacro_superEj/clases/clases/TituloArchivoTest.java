package simulacro_superEj.clases.clases;

import org.junit.Test;
import static org.junit.Assert.*;
public class TituloArchivoTest {
    @Test
    public void testEj53(){
        TituloArchivo tituloArchivo = new TituloArchivo("12345678M","Pepe Lopez","Explotacion de sistemas",Estado.RECIBIDO);
        assertEquals(tituloArchivo.toString(), "12345678M;Pepe Lopez;Explotacion de sistemas;RECIBIDO");
    }

}