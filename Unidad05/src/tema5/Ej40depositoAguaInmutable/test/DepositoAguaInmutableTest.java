package tema5.Ej40depositoAguaInmutable.test;

import org.junit.Test;
import tema5.Ej40depositoAguaInmutable.DepositoAguaInmutable;

import static org.junit.Assert.*;

public class DepositoAguaInmutableTest {
    @Test (expected = java.lang.IllegalArgumentException.class)
    public void test01()throws IllegalArgumentException{
        DepositoAguaInmutable depositoAguaInmutable = new DepositoAguaInmutable(50, -100);
        fail("ha saltado inesperadamente");
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test02()throws IllegalArgumentException{
        DepositoAguaInmutable depositoAguaInmutable = new DepositoAguaInmutable(300, 200);
        fail("ha saltado inesperadamente");
    }
    @Test
    public void test03(){
        DepositoAguaInmutable depositoAguaInmutable = new DepositoAguaInmutable(20, 500);
        assertEquals(4, depositoAguaInmutable.getPorcentaje(), 0.01);
    }

    @Test
    public void test04(){
        DepositoAguaInmutable depositoAguaInmutable = new DepositoAguaInmutable(400, 500);
        DepositoAguaInmutable depositoAguaInmutable1 = depositoAguaInmutable.añadirLitro();
        assertEquals(400, depositoAguaInmutable.capacidadActual(), 0.01);
        assertEquals(401, depositoAguaInmutable1.capacidadActual(), 0.01);
    }


}