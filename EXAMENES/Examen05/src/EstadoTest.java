import org.junit.Test;

import static org.junit.Assert.*;

public class EstadoTest {
    @Test
    public void test01(){
        assertEquals(Estado.ENCENDIDA_OK.estaEncendido(), true);
    }
}