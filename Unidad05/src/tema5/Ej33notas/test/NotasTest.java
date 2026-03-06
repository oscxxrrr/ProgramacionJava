package tema5.Ej33notas.test;

import org.junit.Test;
import tema5.Ej33notas.Notas;

import static org.junit.Assert.*;

public class NotasTest {
    @Test
    public void test01(){
        Notas notas = new Notas();
        notas.añadirNota(8);
        notas.añadirNota(5);
        notas.añadirNota(9);
        notas.añadirNota(1);
        notas.añadirNota(6);
        assertEquals(9, notas.calcularNotaMaxima(), 0.01);
        assertEquals(5.8, notas.calcularNotaMedia(), 0.01);
    }
    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test02()throws IllegalArgumentException{
        Notas notas = new Notas();
        notas.calcularNotaMaxima();
        fail("Deberia de haber saltado el error");
    }


}