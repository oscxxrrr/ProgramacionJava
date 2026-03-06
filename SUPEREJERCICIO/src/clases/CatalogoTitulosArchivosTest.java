package clases;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatalogoTitulosArchivosTest {
    @Test
    public void test01(){
        CatalogoTitulosArchivos catalogoTitulosArchivos = new CatalogoTitulosArchivos("tituloarchivo.txt");
        assertEquals(CatalogoTitulosArchivos.extraerTitulo("12345678M;Pepe López;Explotación de Sistemas Informáticos;1"), "12345678M;Pepe López;Explotación de Sistemas Informáticos;1");
    }

}