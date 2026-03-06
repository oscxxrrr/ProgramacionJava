package tema5.Ej38banco.test;

import org.junit.Assert;
import org.junit.Test;
import tema5.Ej38banco.Adinerado;
import tema5.Ej38banco.Banco;
import static org.junit.Assert.*;

public class BancoTest {
    @Test
    public void test01(){
        Banco banco = new Banco();

        assertTrue(banco.añadirDinero(1000));
        assertEquals(1000, banco.getDineroTotal(), 0.01);


        assertTrue(banco.retirarDinero(200));
        assertEquals(800, banco.getDineroTotal(), 0.01);


        assertFalse(banco.retirarDinero(4000));
        assertEquals(800, banco.getDineroTotal(), 0.01);

    }

    //EJERCICIO 39
    @Test
    public void test02(){
        Banco banco = new Banco();
        assertFalse(banco.tieneDinero());
    }

    @Test
    public void test03(){
        Banco banco1 = new Banco();
        Banco banco2 = new Banco();
        banco1.añadirDinero(2500);
        banco2.añadirDinero(5000);

        banco2.transferirDesde(banco1,2500);
        assertEquals(7500, banco2.getDineroTotal(), 0.01);
        assertEquals(0, banco1.getDineroTotal(), 0.01);
    }
    @Test
    public void test04(){
        Banco banco1 = new Banco();
        Banco banco2 = new Banco();
        banco1.añadirDinero(2500);
        banco2.añadirDinero(5000);

        Adinerado.transferir(banco1, banco2, 2500);
        assertEquals(7500, banco2.getDineroTotal(), 0.01);
        assertEquals(0, banco1.getDineroTotal(), 0.01);
    }
    @Test
    public void test05(){
        Banco banco1 = new Banco();
        Banco banco2 = new Banco();
        banco1.añadirDinero(2500);
        banco2.añadirDinero(5000);

        assertFalse(Adinerado.transferir(banco1, banco2, 500));
    }


}