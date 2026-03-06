package com.Cocina.test;

import com.Cocina.Cocina;
import com.Cocina.Electrodomestico;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CocinaTest {

    @Test
    public void test01(){
        Cocina cocina = new Cocina(200);

        try {
            cocina.añadirElectrodomestico("Frigorifico", "LG");
            cocina.añadirElectrodomestico("Tuper", "LG");
        } catch (IOException e) {
            fail("No deberia de haber saltado una excepcion");
        }

    }

    @Test(expected = java.io.IOException.class)
    public void test02()throws IOException{
        Cocina cocina = new Cocina(200);
        cocina.añadirElectrodomestico("Frigorifico", "LG");
        cocina.añadirElectrodomestico("Frigorifico", "LG");
        fail("Deberia de haber saltado la excepcion");
    }
}