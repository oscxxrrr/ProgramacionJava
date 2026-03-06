package tema5.ej1persona.test;

import org.junit.Test;
import tema5.ej1persona.DNI;
import tema5.ej1persona.Persona;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class PersonaTest {
    //EJERCICIO 10
    @Test
    public void test1(){
        Persona pepe = new Persona("Pepe", new DNI("12345678F"), 1500.0, LocalDate.of(2007,3,7));
        Persona pepe2 = new Persona("Pepe", 12345678, 'F', 1500.0, LocalDate.of(2007,3,7));

        Persona antonio = new Persona("Antonio",new DNI("87766554X"));
        Persona antonio2 = new Persona("Antonio", 88776655, 'X');
        assertEquals(900.0, antonio2.sueldo, 0.01);
    }

    @Test
    public void test2(){
        Persona pepe = new Persona("Juan", new DNI("11111111H"), 1500.0, LocalDate.of(2007,3,7));
        pepe.cobrarSueldo();
        pepe.cobrarSueldo();
        pepe.cobrarSueldo();
        assertEquals(4500,pepe.cuenta.saldo, 0.01);
        pepe.aumentarSueldo(25);
        pepe.cobrarSueldo();
        assertEquals(6375,pepe.cuenta.saldo, 0.01);

    }
    //EJERCICIO 12
    @Test
    public void test3(){
        Persona pepe = new Persona("Juan", new DNI("11111111H"), 1500.0, LocalDate.of(2011,3,7));
        pepe.esMayorEdad();
        assertFalse(pepe.esMayorEdad());
        Persona pepe2 = new Persona("Juan", new DNI("11111111H"), 1500.0, LocalDate.of(1981,3,7));
        pepe.esMayorEdad();
        assertTrue(pepe2.esMayorEdad());
    }

    @Test
    public void test4() {
        Persona pepe = new Persona("Juan", new DNI("11111111H"), 1800.0, LocalDate.of(2011,3,7));
        Persona pepe2 = new Persona("Juan", new DNI("11111111H"), 900.0, LocalDate.of(2011,3,7));

        assertFalse(pepe.tieneDinero());
        assertFalse(pepe.esMileurista());
        assertTrue(pepe2.esMileurista());
    }


}