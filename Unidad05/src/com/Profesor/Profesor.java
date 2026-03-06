package com.Profesor;

import java.util.HashMap;
import java.util.Map;

public class Profesor {
    public String nombre;
    public String asignatura;
    public Map<String, Integer> alumnos;

    public Profesor(String n, String a){
        this.nombre = n;
        this.asignatura = a;
        this.alumnos = new HashMap<>();
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getAsignatura(){
        return this.asignatura;
    }
    public void setAsignatura(String a){
        String[] asig = {"Programacion","base de datos", "lenguajes", "entornos", "sistemas"};
        boolean salir = true;
        this.asignatura = null;
        for (int i = 0; i < asig.length && salir; i++) {
            if (asig[i].equalsIgnoreCase(a)){
                this.asignatura = a;
                salir = false;
            }
        }
    }
    public int getNumeroAlumnos(){
        return this.alumnos.size();
    }

    public void matricular(String nombreAlumno){
        this.alumnos.put(nombreAlumno, 0);
    }
    public void ponerNota(String nombreAlumno, int nota){
        if (alumnos.containsKey(nombreAlumno)){
            if (nota >= 0 && nota <= 10){
                this.alumnos.put(nombreAlumno, nota);
            }
        }
    }

}
