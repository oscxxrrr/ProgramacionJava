package tema5.ej5oficina.test;

import org.junit.Test;
import tema5.ej1persona.DNI;
import tema5.ej1persona.Persona;
import tema5.ej5oficina.Oficina;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class OficinaTest {
    @Test
    public void test1(){
        Oficina oficina = new Oficina("HP");
        assertEquals("HP", oficina.nombre);
        assertEquals(0, oficina.trabajadores.size());
    }
    @Test
    public void test2(){
        Oficina oficina = new Oficina("HP");
        assertEquals("HP", oficina.nombre);
        assertEquals(0, oficina.trabajadores.size());
    }
    @Test
    public void test3(){
        Oficina oficina1 = new Oficina("HP",0);
        assertEquals("HP", oficina1.nombre);
        assertEquals(0, oficina1.trabajadores.size());

        Oficina oficina2 = new Oficina("HP",1);
        assertEquals("HP", oficina2.nombre);
        assertEquals(1, oficina2.trabajadores.size());

        Oficina oficina3 = new Oficina("HP",2);
        assertEquals("HP", oficina3.nombre);
        assertEquals(2, oficina3.trabajadores.size());

        Oficina oficina4 = new Oficina("HP",3);
        assertEquals("HP", oficina4.nombre);
        assertEquals(3, oficina4.trabajadores.size());
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test4(){
        Oficina oficina = new Oficina("HP", 5);
        assertEquals("HP", oficina.nombre);
        assertEquals(0, oficina.trabajadores.size());
        fail("Ha saltado de manera inesperada");
    }

    @Test
    public void test5(){
        Oficina oficina = new Oficina("Amazon",1);
        oficina.añadirEpleado("Antonio", "44444444M", 2000.0, LocalDate.of(1007,1,2));
    }

    @Test
    public void test6(){
        Oficina oficina = new Oficina("Amazon",1);
        Persona persona1 = new  Persona("Antonio", new DNI("41606202F"), 1000.0, LocalDate.of(1007,1,2));
        oficina.añadirEmpleados(persona1);
        Persona persona2 = new  Persona("Antonio", new DNI("41606202F"), 2000.0, LocalDate.of(1007,1,2));
        oficina.añadirEmpleados(persona2);

        oficina.trabaja(persona1);
        assertTrue(oficina.trabaja(persona1));

        oficina.pagarEmpleados();
        assertEquals(1000, persona1.cuenta.saldo, 0.01);
        assertEquals(2000, persona2.cuenta.saldo, 0.01);
    }
    @Test
    public void test7(){
        Oficina oficina = new Oficina("Amazon",1);
        Persona persona1 = new  Persona("Antonio", new DNI("41606202F"), 1000.0, LocalDate.of(1007,1,2));
        oficina.añadirEmpleados(persona1);
        Persona persona2 = new  Persona("Antonio", new DNI("41606202F"), 2000.0, LocalDate.of(1007,1,2));
        oficina.añadirEmpleados(persona2);

        oficina.trabaja(persona1);
        assertTrue(oficina.trabaja(persona1));

        oficina.pagarEmpleados();
        assertEquals(1000, persona1.cuenta.saldo, 0.01);
        assertEquals(2000, persona2.cuenta.saldo, 0.01);
        oficina.mostrarInformeEmpleados();
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void test8(){
        Oficina oficina = new Oficina("Amazon",5);
        fail("No ha saltado el mensaje de IllegarArgumentException");
    }

//    @Test(expected = IOException.class)
//    public void test9() throws IOException {
//        Oficina oficina = new Oficina("Amazon", 2);
//        oficina.añadirEpleado("Oscar", "41606202F", 1000, LocalDate.now());
//        oficina.añadirEpleado("Pepe", "41636202F", 2000, LocalDate.now());
//        oficina.añadirEpleado("Juan", "41666202F", 1500, LocalDate.now());
//        oficina.añadirEpleado("Miguel", "47606202F", 900, LocalDate.now());
//        oficina.getSueldoMedio();
//        fail("Ha saltado inesperadamente");
//    }

    @Test
    public void test(){
        Oficina[] oficina = new Oficina[4];
        oficina[0] = Oficina.getOficinaVacia();
        oficina[1] = Oficina.getOficinaPequeña();
        oficina[2] = Oficina.getOficinaMediana();
        oficina[3] = Oficina.getOficinaGrande();
        for (int i = 0; i < oficina.length; i++) {
            assertEquals(i, oficina[i].getTotalEmpleados());
        }

    }





}