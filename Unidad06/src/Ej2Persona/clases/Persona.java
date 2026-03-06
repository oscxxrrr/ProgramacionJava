package Ej2Persona.clases;

import java.util.ArrayList;

public interface Persona {
    public abstract String getNombre();
    public abstract String getApellido();
    public abstract String getApelliod2();
    public default String[] getApellidos(){
            String[] resultado = {this.getApellido(), this.getApelliod2()};
            return resultado;
        }

    public abstract Direccion getDireccion();
    public abstract String getTelefono();
    public abstract EstadoCivil getEstadoCivil();
    public abstract Persona getPareja();
}

