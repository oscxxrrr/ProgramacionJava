package com.Profesor.test;

import com.Profesor.Profesor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfesorTest {
    @Test
    public void test1(){
        Profesor profesor = new Profesor("Antonio", "Programacion");
        profesor.matricular("Omar");
        assertEquals(1, profesor.getNumeroAlumnos());
    }

}