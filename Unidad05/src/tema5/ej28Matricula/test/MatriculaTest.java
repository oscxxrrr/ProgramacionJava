package tema5.ej28Matricula.test;

import org.junit.Before;
import org.junit.Test;
import tema5.ej28Matricula.Matricula;

import static org.junit.Assert.*;

public class MatriculaTest {
    @Before
    public void reiniciarMatriucla(){
        Matricula.siguienteNúmeroMarticula = 1;
    }

    @Test
    public void test01(){
        Matricula matricula = new Matricula("Oscar", "Programacion");
        Matricula matricula2 = new Matricula("Oscar", "Programacion");
        Matricula matricula3 = new Matricula("Oscar", "Programacion");

        assertEquals(3, matricula3.getNúmeroMarticula());
    }
    @Test
    public void test02(){
        Matricula matricula = new Matricula("Oscar", "Programacion");
        Matricula matricula2 = new Matricula("Oscar", "Programacion");
        Matricula matricula3 = new Matricula("Oscar", "Programacion");

        assertEquals(4, Matricula.siguienteNúmeroMarticula);
    }

}