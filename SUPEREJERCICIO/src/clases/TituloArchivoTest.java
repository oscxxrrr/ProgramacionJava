package clases;

import org.junit.Test;

import static org.junit.Assert.*;

public class TituloArchivoTest {
    @Test
    public void test01(){
        TituloArchivo tituloArchivo = new TituloArchivo("12345678M", "Pepe López", "Explotación de Sistemas Informáticos", Estado.RECIBIDO);
        assertEquals("12345678M;Pepe López;Explotación de Sistemas Informáticos;1", tituloArchivo.toString());
    }
}