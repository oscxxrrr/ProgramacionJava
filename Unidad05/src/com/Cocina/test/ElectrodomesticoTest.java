package com.Cocina.test;

import com.Cocina.Electrodomestico;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectrodomesticoTest {
    @Test
    public void test01(){
        Electrodomestico electrodomestico = new Electrodomestico("Frigorifico", "Samsung");
        assertEquals("Frigorifico", electrodomestico.getNombre());
        assertEquals("Samsung", electrodomestico.getMarca());
        assertSame(20, electrodomestico.getPotencia());
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test02(){
        Electrodomestico electrodomestico = new Electrodomestico("Frigorifico", "Samsung", true, 5);
        fail("Deberia de haber dado error");
    }

}