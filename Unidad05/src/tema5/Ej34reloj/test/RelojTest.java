package tema5.Ej34reloj.test;

import org.junit.Test;
import tema5.Ej34reloj.Reloj;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class RelojTest {
    @Test
    public void test01(){
        Reloj reloj = new Reloj(LocalTime.of(16,0,0));
        reloj.añadirSegundos(3600);
        assertEquals(LocalTime.of(17, 0,0), reloj.getHora());
    }
    @Test
    public void test02(){
        Reloj reloj = new Reloj(LocalTime.of(23,59));
        reloj.añadirSegundos(60);
        assertEquals(LocalTime.of(0,0), reloj.getHora());
    }
    @Test
    public void test03(){
        Reloj reloj = new Reloj(LocalTime.of(19,30));
        assertFalse(reloj.esNoche());
        reloj.añadirSegundos(3600);
        assertTrue(reloj.esNoche());
    }
    @Test
    public void test04(){
        Reloj reloj = new Reloj(LocalTime.of(7,30));
        assertTrue(reloj.esNoche());
        reloj.añadirSegundos(3600);
        assertFalse(reloj.esNoche());

    }

    @Test
    public void test06(){
        Reloj reloj = new Reloj(LocalTime.of(15,28));
        reloj.toString();

    }




}