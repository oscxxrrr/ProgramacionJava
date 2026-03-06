package tema5.ej32Bingo.test;

import org.junit.Test;
import tema5.ej32Bingo.Bombo;

import static org.junit.Assert.assertEquals;

public class BingoTest {

    @Test
    public void test01() {
        Bombo bombo = new Bombo(100);

        for (int i = 0; i < 100; i++) {
            bombo.sacarBola();

        }

        assertEquals(0, bombo.getNumeroBolas());
    }
}
