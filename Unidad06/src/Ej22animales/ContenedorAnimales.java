package Ej22animales;

import java.util.HashSet;
import java.util.Set;

public abstract class ContenedorAnimales {
    protected Set<Animal> animales;

    public ContenedorAnimales(){
        this.animales = new HashSet<>();
    }

    public boolean añadir(Animal a){
        boolean resultado = false;
        if (comprobarDisponibilidad(a)){
            resultado = true;
            this.animales.add(a);
        }
        return resultado;
    }

    public boolean retirar(Animal a){
        boolean resultado = false;
        if (this.animales.contains(a)){
            resultado = true;
            this.animales.remove(a);
        }
        return resultado;
    }

    public int getPesoActual(){
        int pesTot = 0;
        for (Animal a : this.animales) {
            pesTot+=a.getPeso();
        }
        return pesTot;
    }

    public int getNumeroAnimales(){
        return this.animales.size();
    }

    protected abstract boolean comprobarDisponibilidad(Animal a);
}
