package tema5.ej3marcadorBaloncesto.test;

import org.junit.Test;
import tema5.ej3marcadorBaloncesto.MarcadorBaloncesto;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;

import static org.junit.Assert.*;

public class MarcadorBaloncestoTest {
    @Test
    public void test1(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", 100, "Estudiantes", 90, LocalDate.of(2010,10,10));
        assertEquals("Granada", marcadorBaloncesto.getNombreLocal());
        assertEquals(100, marcadorBaloncesto.getPuntosLocal());
        assertEquals("Estudiantes", marcadorBaloncesto.getNombreVisitante());
        assertEquals(90, marcadorBaloncesto.getPuntosVisitante());
        assertEquals(LocalDate.of(2010,10,10), marcadorBaloncesto.getFecha());
    }
    @Test
    public void test2(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", "Estudiantes");
        assertEquals("Granada", marcadorBaloncesto.getNombreLocal());
        assertEquals(0, marcadorBaloncesto.getPuntosLocal());
        assertEquals("Estudiantes", marcadorBaloncesto.getNombreVisitante());
        assertEquals(0, marcadorBaloncesto.getPuntosVisitante());

    }
    @Test
    public void test3(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", "Estudiantes", LocalDate.of(2000,2,28));
        assertEquals("Granada", marcadorBaloncesto.getNombreLocal());
        assertEquals(0, marcadorBaloncesto.getPuntosLocal());
        assertEquals("Estudiantes", marcadorBaloncesto.getNombreVisitante());
        assertEquals(0, marcadorBaloncesto.getPuntosVisitante());

    }
    @Test
    public void test4(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", "Estudiantes");
        for (int i = 0; i < 17; i++) {
            if (i<5){
                marcadorBaloncesto.añadirCanasta('L', 1);
            } else if (i>=5 && i <=12) {
                marcadorBaloncesto.añadirCanasta('L', 2);
            }else {
                marcadorBaloncesto.añadirCanasta('L', 3);
            }
        }
        assertEquals(33,marcadorBaloncesto.getPuntosLocal(), 0.01);

        for (int i = 0; i < 14; i++) {
            if (i<3){
                marcadorBaloncesto.añadirCanasta('V', 1);
            } else if (i>=3 && i <=12) {
                marcadorBaloncesto.añadirCanasta('V', 2);
            }else {
                marcadorBaloncesto.añadirCanasta('V', 3);
            }
        }
        assertEquals(26,marcadorBaloncesto.getPuntosVisitante(), 0.01);
    }

    @Test
    public void test5() {
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", "Estudiantes");
        for (int i = 0; i < 100; i++) {
            if (i<80){
                marcadorBaloncesto.añadirCanasta('V', 1);
            }
            marcadorBaloncesto.añadirCanasta('L', 1);
        }
        assertEquals(100,marcadorBaloncesto.getPuntosLocal());
        assertEquals(80,marcadorBaloncesto.getPuntosVisitante());
        marcadorBaloncesto.reset();
        assertEquals(0,marcadorBaloncesto.getPuntosLocal());
        assertEquals(0,marcadorBaloncesto.getPuntosVisitante());
    }
    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test6() {
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", "Estudiantes");
        for (int i = 0; i < 10; i++) {
            marcadorBaloncesto.añadirCanasta('L', 1);
            marcadorBaloncesto.añadirCanasta('V',1);
            if (i == 9){
                marcadorBaloncesto.añadirCanasta('V',2);
            }
        }
        assertEquals(12, marcadorBaloncesto.getPuntosVisitante());

        marcadorBaloncesto.añadirCanasta('L', 4);
        fail("No ha saltado el error");
        assertEquals(10, marcadorBaloncesto.getPuntosLocal());
        assertEquals(12, marcadorBaloncesto.getPuntosVisitante());
    }

    @Test
    public void test7(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", 80, "Estudiantes", 80,LocalDate.now());
        assertEquals("Granada", marcadorBaloncesto.getNombreLocal());
        assertEquals(80, marcadorBaloncesto.getPuntosLocal());
        assertEquals("Estudiantes", marcadorBaloncesto.getNombreVisitante());
        assertEquals(80, marcadorBaloncesto.getPuntosVisitante());
        assertTrue(marcadorBaloncesto.hayEmpate());
        assertFalse(marcadorBaloncesto.ganaLocal());
        assertFalse(marcadorBaloncesto.ganaVisitante());

    }

    @Test
    public void test8(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", 90, "Estudiantes", 80,LocalDate.now());
        assertEquals("Granada", marcadorBaloncesto.getNombreLocal());
        assertEquals(90, marcadorBaloncesto.getPuntosLocal());
        assertEquals("Estudiantes", marcadorBaloncesto.getNombreVisitante());
        assertEquals(80, marcadorBaloncesto.getPuntosVisitante());
        assertFalse(marcadorBaloncesto.hayEmpate());
        assertTrue(marcadorBaloncesto.ganaLocal());
        assertFalse(marcadorBaloncesto.ganaVisitante());

    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test9(){
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", "Estudiantes");
        marcadorBaloncesto.añadirCanasta('E',2);
        marcadorBaloncesto.añadirCanasta('L', 2);
        marcadorBaloncesto.añadirCanasta('L', 6);
        fail("No ha saltado");
    }

    @Test
    public void testEj21()  {
        MarcadorBaloncesto marcadorBaloncesto = new MarcadorBaloncesto("Granada", "Estudiantes");
        for (int i = 0; i < 9; i++) {
            if (i>0&&i<9){
                marcadorBaloncesto.añadirCanasta('V', 1);
            }
            marcadorBaloncesto.añadirCanasta('L', 1);
        }
        assertEquals(12, marcadorBaloncesto.getPuntosLocal());
        assertEquals(8, marcadorBaloncesto.getPuntosVisitante());

        try {
            marcadorBaloncesto.guardar("marcador");
        } catch (IOException e) {
            fail("Ruta incorrecta");
        }

    }


}