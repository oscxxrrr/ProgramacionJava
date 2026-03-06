package com.Frigorifico.test;

import com.Frigorifico.Frigorifico;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrigorificoTest {
    @Test
    public void test1(){
        Frigorifico frigorifico1 = new Frigorifico();
        assertEquals(8, frigorifico1.temperatura);
        assertTrue(frigorifico1.comida.isEmpty());

        Frigorifico frigorifico2 = new Frigorifico(2);
        assertEquals(2, frigorifico2.temperatura);
        assertTrue(frigorifico2.comida.isEmpty());

        Frigorifico frigorifico3 = new Frigorifico(30);
        assertEquals(5, frigorifico3.temperatura);
        assertTrue(frigorifico3.comida.isEmpty());

    }

}