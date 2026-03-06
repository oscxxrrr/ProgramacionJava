package simulacro_superEj.clases.clases;

import java.util.List;
import java.util.NoSuchElementException;

public interface CatologoTitulos {
    public abstract List<Titulo> getTitulos();
    public abstract boolean guardar();

    List<Titulo> getTitulo();

    public abstract boolean añadirTitulos(String dni, String nombre, String estudio, Estado estado);
    public default Titulo getTitulo(String dni){
        Titulo titulo = null;
        boolean salir = true;
        for (int i = 0; i < this.getTitulos().size() && salir; i++) {
            if (this.getTitulos().get(i).getDNI().equals(dni)){
                titulo = this.getTitulos().get(i);
            }
            else {
                salir = false;
            }
        }
        if (!salir){
            throw new NoSuchElementException("DNI NO ENCONTRADO");
        }
        return titulo;
    }
}
