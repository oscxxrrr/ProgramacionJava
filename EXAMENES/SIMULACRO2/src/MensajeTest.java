import org.junit.Test;

import static org.junit.Assert.*;

public class MensajeTest {
        @Test
        public void test1() {
            Mensaje mensaje = new Mensaje("juan@ieshlanz.es", "Esto es una prueba", false, Formato.TEXTO);
            assertEquals("juan@ieshlanz.es;Esto es una prueba;false;0", mensaje.getLineaCSV());
        }
        @Test
        public void test2() {
            Mensaje mensaje = new Mensaje("juan@ieshlanz.es", "Esto es una prueba", false, Formato.TEXTO);
            Mensaje otro = mensaje.leer();
            assertTrue(otro.leido());
        }
    }