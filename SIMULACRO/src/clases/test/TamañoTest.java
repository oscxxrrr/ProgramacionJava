package clases.test;

import clases.Tamaño;
import org.junit.Test;

import static org.junit.Assert.*;

public class TamañoTest {
    @Test
    public void test01(){
        assertEquals(Tamaño.getTamaño(800,600), Tamaño.PEQUEÑO);
        assertEquals(Tamaño.getTamaño(1024,2000), Tamaño.MEDIANO);
        assertEquals(Tamaño.getTamaño(1920,1200), Tamaño.GRANDE);
    }

}