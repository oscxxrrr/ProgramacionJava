package com.Hotel;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
    public String nombre;
    public int numeroPlantas;
    public Map<String, Integer> húespedes;

    public Hotel(String n, int np){
        this.nombre = n;
        this.numeroPlantas = np;
        this.húespedes = new HashMap<>();
    }
    public Hotel(){
        this("Hermenegildo", 4);
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getNumeroPlantas(){
        return this.numeroPlantas;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void construirPlanta(){
        if (numeroPlantas < 10){
            numeroPlantas++;
        }
    }

    public boolean estaVacio(){
        return this.húespedes.isEmpty();
//        boolean resultado;
//        if (húespedes.isEmpty()){
//             resultado = true;
//        }else {
//            resultado = false;
//        }
//        return resultado;
    }
}
