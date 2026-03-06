package clases.test;

import clases.ListaFotos;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ListaFotosTest {
    @Test
    public void test01(){
        ListaFotos listaFotos = new ListaFotos();
        assertTrue(listaFotos.estaVacia());
        assertFalse(listaFotos.borrarFoto("prueba"));
        listaFotos.añadir("alhambra");
        assertTrue(listaFotos.existeFoto("alhambra"));
    }

    @Test
    public void test02(){
        ListaFotos listaFotos = new ListaFotos();
        listaFotos.añadir("foto1");
        listaFotos.añadir("foto2");
        listaFotos.añadir("alhambra");
        listaFotos.añadir("hlanz");
        assertEquals(4, listaFotos.getNumeroFotos());
        assertEquals(408, listaFotos.getFoto("alhambra").alto());
        assertEquals(612, listaFotos.getFoto("alhambra").ancho());
        listaFotos.borrarFoto("foto2");
        assertEquals(3, listaFotos.getNumeroFotos());
    }

    @Test (expected = java.util.NoSuchElementException.class)
    public void test03()throws NoSuchElementException {
        ListaFotos listaFotos = new ListaFotos();
        listaFotos.getFoto("granada");
        fail("Deberia de haber saltado el error");
    }
}