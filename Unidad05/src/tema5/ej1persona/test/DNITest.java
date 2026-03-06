package tema5.ej1persona.test;

import org.junit.Test;
import tema5.ej1persona.DNI;

import static org.junit.Assert.*;

public class DNITest {
    @Test
    public void test1(){
        DNI dni = new DNI(12345678, 'Z');
        assertEquals(12345678,dni.getNumero());
        assertEquals('Z',dni.getLetra());
    }
    @Test
    public void test2(){
        DNI dni = new DNI("12345678X");
        assertEquals(12345678, dni.getNumero());
        assertEquals('X', dni.getLetra());
    }

}