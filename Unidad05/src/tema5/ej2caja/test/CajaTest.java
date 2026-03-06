package tema5.ej2caja.test;

import org.junit.Test;
import tema5.ej2caja.Caja;

import static org.junit.Assert.*;

public class CajaTest {
    @Test
    public void test1(){
        Caja caja = new Caja("Hola amigos");

        assertEquals(null, caja.getMensaje());
        assertFalse(caja.estaAbierta());

    }
    @Test
    public void test2(){
        Caja caja = new Caja(true, "Adios amigos");

        assertEquals("Adios amigos", caja.getMensaje());
        assertTrue(caja.estaAbierta());


    }
    @Test
    public void test3(){
        Caja caja = new Caja(true, "Adios amigos");
        assertEquals("Adios amigos", caja.getMensaje());
        assertTrue(caja.estaAbierta());

        caja.setMensaje("oscar");
        assertEquals("oscar", caja.getMensaje());

        caja.pasarMayusucula();
        assertEquals("OSCAR", caja.getMensaje());


    }

    @Test
    public void test4(){
        Caja caja = new Caja(true, "Hola");
        caja.getMensaje();
        assertEquals("Hola", caja.getMensaje());
    }

    @Test
    public void test5(){
        Caja caja = new Caja(false, "Hola");
        caja.getMensaje();
        assertEquals(null, caja.getMensaje());
    }

}