package tema5.Ej38banco.test;

import org.junit.Assert;
import org.junit.Test;
import tema5.Ej38banco.Monedero;
import static org.junit.Assert.*;


public class MonederoTest {
    @Test
    public void test01(){
        Monedero monedero = new Monedero();
        assertTrue(monedero.añadirDinero(50));
        assertEquals(50, monedero.getDineroTotal(), 0.01);

        assertTrue(monedero.retirarDinero(30));
        assertEquals(20, monedero.getDineroTotal() ,0.01);

        assertFalse(monedero.retirarDinero(400));
        assertEquals(20, monedero.getDineroTotal(), 0.01);
    }

    @Test
    public void test02(){
        Monedero monedero = new Monedero();

        assertTrue(monedero.añadirDinero(50));
        assertEquals(50, monedero.getDineroTotal(), 0.01);

        assertFalse(monedero.añadirDinero(2000));
        assertEquals(50, monedero.getDineroTotal(), 0.01);

        assertTrue(monedero.añadirDinero(950));
        assertEquals(1000, monedero.getDineroTotal(), 0.01);

        assertFalse(monedero.añadirDinero(1));
        assertEquals(1000, monedero.getDineroTotal(), 0.01);

    }

}