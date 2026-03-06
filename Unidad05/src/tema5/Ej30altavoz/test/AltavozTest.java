package tema5.Ej30altavoz.test;

import org.junit.Test;
import tema5.Ej30altavoz.Altavoz;

import static org.junit.Assert.*;

public class AltavozTest {
    @Test
    public void test01(){
        Altavoz altavoz = new Altavoz();
        assertEquals(Altavoz.VOL_MIN, altavoz.getVolumen());
        altavoz.ponerVolumenMaximo();
        assertEquals(Altavoz.VOL_MAX, altavoz.getVolumen());
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test02() throws IllegalArgumentException{
        Altavoz altavoz = new Altavoz();
        altavoz.ponerVolumen(-28);
        fail("Deberia de haber saltado el error.");
    }

    @Test
    public void test03(){
        Altavoz altavoz = new Altavoz();
        altavoz.ponerVolumen(128);
        System.out.println(altavoz.toString());
    }

    @Test
    public void test04(){
        Altavoz altavoz = new Altavoz();
        altavoz.ponerVolumen(Altavoz.VOL_MAX);
        System.out.println(altavoz.toString());
    }

}