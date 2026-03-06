package com.animales.Perro.test;

import com.animales.Perro.Perro;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;
import static org.junit.Assert.*;


public class Ej1PerroTest {
    @Test
    public void test1(){
        Perro perro1 = new Perro("Pepe", 5, "San bernardo");
        assertEquals("Pepe", perro1.getNombre());
        assertEquals(5, perro1.getEdad());
        assertEquals("San bernardo", perro1.getRaza());

        Perro perro2 = new Perro("Antonio", 3, "San bernardo", new Point(6,9), true);
        assertEquals("Antonio", perro2.getNombre());
        assertEquals(3, perro2.getEdad());
        assertEquals("San bernardo", perro2.getRaza());
        assertEquals(new Point(6,9), perro2.getPosicion());
        assertTrue(perro2.getHambriento());

        Perro perro3 = new Perro("Jose", 9, "Pastor aleman", 6,7,false);

    }
    @Test
    public void test2(){
        Perro perro = new Perro("Tim", 2, "Pastor aleman");
        System.out.println("Nombre: " + perro.getNombre());
        perro.setNombre("Tom");
        System.out.println("Nuevo nombre: " + perro.getNombre());
    }

    @Test
    public void test3(){
        Perro perro = new Perro("Tim", 2, "Pastor aleman");
        perro.mostrarAñoNacimiento();
        perro.setEdad(6);
    }

    @Test
    public void test4(){
        Perro perro = new Perro("Tim", 2, "Pastor aleman");
        String nombre = perro.getNombre();
        String raza = perro.getRaza();
        int edad = perro.getEdad();
        boolean hambriento = perro.getHambriento();
        Point pos = perro.getPosicion();

        assertEquals(nombre, perro.getNombre());
        assertEquals(raza, perro.getRaza());
        assertEquals(edad, perro.getEdad());
        assertTrue(perro.getHambriento());
        assertEquals(pos, perro.getPosicion());
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test5(){
        Perro perro = new Perro("Tim", 2, "Pastor aleman");
        perro.setEdad(-8);
        fail("No ha saltado el mensaje de IllegarArgumentException");
    }

    @Test
    public void test6(){
        Perro perro = new Perro("Tim", 2, "Pastor aleman");
        perro.setHambriento(true);
        try {
            perro.comer();
            assertEquals(false, perro.getHambriento());
        } catch (IOException e) {
            fail("Ha saltado una excepcion que no se esperaba");
        }

    }

    @Test(expected = java.io.IOException.class)
    public void test7() throws IOException{
        Perro perro = new Perro("Tim", 2, "Pastor aleman");
        perro.setHambriento(false);
        perro.comer();
        fail("No ha lanzado la excepcion esperada");
    }
}