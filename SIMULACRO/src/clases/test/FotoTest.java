package clases.test;

import clases.Foto;
import clases.Tamaño;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FotoTest {
    @Test
    public void test01() {

        try {
            Foto foto = Foto.cargarFoto("foto1");
            assertEquals(foto.nombre(), "foto1");
            assertEquals(foto.ancho(), 800, 0.01);
            assertEquals(foto.alto(), 600, 0.01);
            assertEquals(foto.tamaño(), Tamaño.PEQUEÑO);
        } catch (IOException e) {
            fail("Ha saltado inesperadamente");
        }

    }
    @Test
    public void test02(){
        try {
            Foto foto1 = Foto.cargarFoto("foto1");
            Foto foto2 = Foto.cargarFoto("foto2");
            assertTrue(foto2.mayorQue(foto1));
        } catch (IOException e) {
            fail("Ha saltado inesperadamente");
        }

    }

}