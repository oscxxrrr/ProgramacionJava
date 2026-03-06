package tema5.ej7cuentaCorriente.test;

import com.animales.Perro.Perro;
import org.junit.Test;
import tema5.ej7cuentaCorriente.CuentaCorriente;

import java.awt.*;
import java.io.IOException;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {
    @Test
    public void test1(){
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1253, 850.0);
        assertEquals(1253, cuentaCorriente.número, 0.01);
        assertEquals(850.0, cuentaCorriente.saldo, 0.01);
    }
    @Test
    public void test2(){
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1253, 850.0);
        assertEquals(1253, cuentaCorriente.número, 0.01);
        assertEquals(850.0, cuentaCorriente.saldo, 0.01);
    }

    @Test(expected = java.io.IOException.class)
    public void test3()throws IOException {
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1223, 2000);
        cuentaCorriente.retirarDinero(6000);
        fail("Deberia de haber saltado la excepcion");
    }

}