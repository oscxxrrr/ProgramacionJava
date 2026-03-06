package clases;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface ColeccionFotos {
    public abstract int getNumeroFotos();
    public abstract boolean existeFoto(String nombre);
    public abstract Foto getFoto(String nombre);
    public abstract boolean borrarFoto(String nombre);
    public abstract List<Foto> getFotos(Tamaño tamaño);

    public default List<Foto> getFotos(String[] nombres){
        List<Foto> fotos = new ArrayList<>();
        for (int i = 0; i < nombres.length; i++) {
            if (this.existeFoto(nombres[i])){
                fotos.add(this.getFoto(nombres[i]));
            }
        }
        return fotos;
    }

    public default boolean estaVacia(){
        return this.getNumeroFotos() == 0;
    }
}
