package tema5.DNImejorado.test;

import org.junit.Test;
import tema5.DNImejorado.DNImejorado;

import static org.junit.Assert.*;

public class DNImejoradoTest {
    @Test
    public void test1(){
        DNImejorado dni = new DNImejorado(11111111);
        assertEquals(11111111, dni.getNumero());
        assertEquals('H', dni.getLetra());
    }

}