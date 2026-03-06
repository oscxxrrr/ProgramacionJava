package tema5.Ej41empleado;

import java.util.ArrayList;
import java.util.List;

public record Empleado(String nombre, List<Empleado> subordinados) {
    public Empleado(String nombre){
        this(nombre, new ArrayList<>());
    }
    public void mostrarSubordinados(){
        System.out.println(this.nombre);

    }
}
