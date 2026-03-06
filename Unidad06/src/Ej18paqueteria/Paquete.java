package Ej18paqueteria;

import com.sun.source.tree.BreakTree;

import java.util.Objects;

public class Paquete {
    public static final int ALTA=1;
    public static final int MEDIA=2;
    public static final int BAJA=3;
    private String producto;
    private String direccionDestino;
    private int prioridad;

    public Paquete(String pro, String dd, int pri){
        if (pri <= 0 || pri > 3){
            throw new IllegalArgumentException("Nivel de prioridad incorrecta");
        }
        this.producto = pro;
        this.direccionDestino = dd;
        this.prioridad = pri;
    }
    public String getProducto(){
        return this.producto;
    }
    public String getDireccionDestino(){
        return this.direccionDestino;
    }
    public int getPrioridad(){
        return this.prioridad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Paquete paquete = (Paquete) o;
        return Objects.equals(producto, paquete.producto) && Objects.equals(direccionDestino, paquete.direccionDestino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producto, direccionDestino);
    }
    public int compareTo(Paquete p){
        return this.prioridad - p.prioridad;
    }
}
