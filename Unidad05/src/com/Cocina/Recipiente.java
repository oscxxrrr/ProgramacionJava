package com.Cocina;

import java.util.ArrayList;
import java.util.List;

public class Recipiente {
    private String tipo;
    private int volumen;

    public Recipiente(String t, int v){
        List<String> tipos = List.of("olla", "sarten", "tarro", "mortero", "cafetera", "caja", "plato", "taper");
        if (!tipos.contains(t)){
            throw new IllegalArgumentException("Tipo incorrecto");
        }
        if (v < 0){
            throw new IllegalArgumentException("Volumen incorrecto");
        }
        this.tipo = t;
        this.volumen = v;

    }

    public String getTipo(){
        return this.tipo;
    }
    public int getVolumen(){
        return this.volumen;
    }
}
