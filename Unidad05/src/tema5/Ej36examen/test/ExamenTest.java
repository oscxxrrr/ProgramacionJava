package tema5.Ej36examen.test;

import org.junit.Test;
import tema5.Ej36examen.Examen;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ExamenTest {
    @Test
    public void test01(){
        Examen examen = new Examen("Jose\"");
        examen.responder("¿Cuanto es 2+2?", "4");
        examen.responder("¿Cual es planeta mas cercano al Sol", "Mercurio");
        examen.responder("¿Cual es la capital de España", "Madrid");
        examen.responder("¿Cuantos kilos son 2500 gramos", "2.5");

        Map<String,String> correctas = new HashMap<>();
        correctas.put("¿Cuanto es 2+2?", "24");
        correctas.put("¿Cual es planeta mas cercano al Sol", "Mercurio");
        correctas.put("¿Cual es la capital de España", "Madrid");
        correctas.put("¿Cuantos kilos son 2500 gramos", "2500");

        double nota = examen.calificar(correctas);
        assertEquals(5, nota, 0.01);

    }

}