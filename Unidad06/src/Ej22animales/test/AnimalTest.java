package Ej22animales.test;

import Ej22animales.Leon;
import Ej22animales.Tigre;
import Ej22animales.TransporteAnimales;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void test01(){
        Leon[] leones = {
                new Leon("pepe", 100),
                new Leon("manu", 50),
                new Leon("jose", 90),
                new Leon("rodri", 40),
                new Leon("juan", 120),
                new Leon("ramon", 100)
        };
        TransporteAnimales transporteAnimales = new TransporteAnimales();

        for (int i = 0; i < leones.length; i++) {
            assertEquals(leones[i].isEncerrado(), false);
            transporteAnimales.añadir(leones[i]);
            assertEquals(leones[i].isEncerrado(), true);
        }
        assertEquals(6,transporteAnimales.getNumeroAnimales());
        assertEquals(500,transporteAnimales.getPesoActual());
    }

    @Test
    public void test02(){
        TransporteAnimales transporteAnimales = new TransporteAnimales();
        transporteAnimales.añadir(new Leon("pepito", 50));
        transporteAnimales.añadir(new Leon("pepe", 12));
        transporteAnimales.añadir(new Leon("pto", 13));
        transporteAnimales.añadir(new Leon("po", 14));
        transporteAnimales.añadir(new Leon("jos", 15));
        transporteAnimales.añadir(new Leon("man", 16));

        assertFalse(transporteAnimales.añadir(new Leon("pepeeee", 12)));
    }

    @Test
    public void test03(){
        TransporteAnimales transporteAnimales = new TransporteAnimales();
        transporteAnimales.añadir(new Leon("pepe", 12));
        transporteAnimales.añadir(new Leon("pepe", 12));
        assertFalse(transporteAnimales.añadir(new Tigre("pepe", 12)));
    }

}