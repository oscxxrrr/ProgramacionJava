package com.Cocina;

public class Electrodomestico {
    private String nombre;
    private String marca;
    private boolean encendido;
    private int potencia;

    public Electrodomestico(String n, String m, boolean e, int p){
        if (p <= 10 || p >=500){
            throw new IllegalArgumentException("Potencia incorrecta");
        }
        this.potencia = p;
        this.nombre = n;
        this.marca = m;
        this.encendido = e;

    }
    public Electrodomestico(String n, String m){
        this(n,m,false,20);
    }

    public String getNombre(){
        return this.nombre;
    }
    public String getMarca(){
        return this.marca;
    }
    public boolean estaEncendido(){
        return this.encendido;
    }
    public int getPotencia(){
        return this.potencia;
    }
}
