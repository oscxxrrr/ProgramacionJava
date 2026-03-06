package tema5.Ej43_44_45marcador.test;

import tema5.Ej43_44_45marcador.TipoCanasta;
import tema5.Ej43_44_45marcador.TipoEquipo;

public record Equipo(String nombre, int puntos) {
    public Equipo{
        if (puntos<0){
            throw new IllegalArgumentException("Puntos negativos, error");
        }
    }
    public Equipo(String nombre){
        this(nombre, 0);
    }
    public Equipo añadirCanasta(TipoCanasta t){
        return new Equipo(nombre, puntos + t.getValor());
    }
}
