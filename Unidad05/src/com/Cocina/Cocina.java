package com.Cocina;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cocina {
    private int area;
    private List<Electrodomestico> electrodomesticos;
    private List<Recipiente> armario;

    public Cocina(int a){
        this.area = a<=0? 100:a;
        this.electrodomesticos = new ArrayList<>();
        this.armario = new ArrayList<>();
    }

    public int getNumeroElectrodomesticosEncendidos(){
        int cont = 0;
        for (Electrodomestico e : this.electrodomesticos) {
            if (e.estaEncendido()){
                cont++;
            }
        }
        return cont;
    }

    public void añadirElectrodomestico(Electrodomestico e){
        this.electrodomesticos.add(e);
    }

    public void añadirElectrodomestico(String n, String m) throws IOException{
        for (Electrodomestico e : this.electrodomesticos) {
            if (e.getNombre().equalsIgnoreCase(n) && e.getMarca().equalsIgnoreCase(m)){
                throw new IOException("Ese electrodomestico ya existe");
            }
        }
        this.electrodomesticos.add(new Electrodomestico(n,m));
    }

    public void añadirRecipiente(String tipo){
        this.armario.add(new Recipiente(tipo, 1));
    }

    public void añadirRecipiente(String tipo, int cantidad){
        for (int i = 0; i < cantidad; i++) {
            this.añadirRecipiente(tipo);
        }
    }

    public void añadirRecipientes(String[] tipo){
        for (String t : tipo) {
            this.añadirRecipiente(t);
        }
    }

    public void añadirRecipientes(String[] tipos, int[] volumenes){
        for (int i = 0; i < tipos.length; i++) {
            this.armario.add(new Recipiente(tipos[i], volumenes[i]));
        }
    }

    public void añadirRecipientes(Map<String, Integer> cantidades){
        for(String claves : cantidades.keySet()){
            int cant = cantidades.get(claves);
            this.añadirRecipiente(claves, cant);
        }
    }
}
