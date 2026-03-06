import jd.personajes.lib.Habitacion;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EquipoVigilancia {
    public static final int LIMITE_CAMARAS = 6;
    private Graphics graphics;
    private List<Camara> camaras;

    public EquipoVigilancia(Graphics g){
        this.graphics = g;
        this.camaras = new ArrayList<>();
    }

    public boolean añadirCamaraHabitacion(Habitacion h){
        boolean resultado;
        CamaraHabitacion cam = new CamaraHabitacion(h);
        if (this.camaras.contains(cam)){
            resultado = false;
        }else {
            resultado = true;
            this.camaras.add(new CamaraHabitacion(h));
        }
        return resultado;
    }

    public void encender(){
        for (int i = 0; i < this.camaras.size(); i++) {
            this.camaras.get(i).encender();
        }
    }
    public void apagar(){
        for (int i = 0; i < this.camaras.size(); i++) {
            this.camaras.get(i).apagar();
        }
    }

    public boolean estaEncendido(){
        boolean resultado = false;
        boolean seguir = true;
        for (int i = 0; i < this.camaras.size() && seguir; i++) {
            if (this.camaras.get(i).estaEncendida()){
                resultado = true;
                seguir = false;
            }
        }
        return resultado;
    }

    public int getNumeroCamarasAveriadas(){
        int cont = 0;
        for (int i = 0; i < this.camaras.size(); i++) {
            if (this.camaras.get(i).getEstado().ordinal() == 1){
                cont++;
            }
        }
        return cont;
    }

    public int repararCamarasAveriadas(){
        int cont = 0;
        if (this.getNumeroCamarasAveriadas() == 0){
            throw new IllegalArgumentException("No hay camaras averiadas");
        }
        for (int i = 0; i < this.camaras.size(); i++) {
            if (this.camaras.get(i).getEstado().ordinal() == 1){
                this.camaras.get(i).reparar();
                cont++;
            }
        }
        return cont;
    }
}
