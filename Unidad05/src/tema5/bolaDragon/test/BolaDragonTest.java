package tema5.bolaDragon.test;

import org.junit.Test;
import tema5.bolaDragon.BolaDragon;

import static org.junit.Assert.*;

public class BolaDragonTest {
    @Test
    public void test01(){
        BolaDragon[] bolas = new BolaDragon[7];
        for (int i = 0; i < 7; i++) {
            try {
                bolas[i] = BolaDragon.crearBolaDragon();
            } catch (Exception e) {
                fail("Falla porq no se han creado las 7 bolas");
            }
            for (int j = 0; j < 7; j++) {
                assertEquals(i+1, bolas[i].getNúmero());
            }
        }
    }

    @Test(expected = java.lang.Exception.class)
    public void test02()throws Exception{
        for (int i = 0; i < 8; i++) {
            BolaDragon bolaDragon = BolaDragon.crearBolaDragon();
        }
        fail("No se ha lanzado la excepcion");
    }

}