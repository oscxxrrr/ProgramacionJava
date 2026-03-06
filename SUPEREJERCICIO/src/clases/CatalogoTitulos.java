package clases;

import java.util.List;
import java.util.NoSuchElementException;

public interface CatalogoTitulos {
    public abstract List<Titulo> getTitulos();
    public abstract boolean guardar();
    public abstract boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado);
    public default Titulo getTitulo(String dni){
        Titulo titulo = null;
        boolean salir = true;
        for (int i = 0; i < this.getTitulos().size() && salir; i++) {
            if (this.getTitulos().get(i).getDNI().equalsIgnoreCase(dni)){
                titulo = this.getTitulos().get(i);
            }else {
                salir = false;
                throw new NoSuchElementException("Titulo cuyo DNI " + dni + " no encontrado");
            }
        }
        return titulo;
    }

}
