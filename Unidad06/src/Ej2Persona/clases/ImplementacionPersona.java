package Ej2Persona.clases;

import com.sun.source.doctree.SinceTree;

class ImplementacionPersona implements Persona{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private Direccion direccion;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;

    public ImplementacionPersona(String nombre, String apellido1, String apellido2, int edad, String calle, String ciudad, String pais,
                                 String telefono, EstadoCivil ec, Persona pareja){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.direccion = new Direccion(calle, ciudad, pais);
        this.telefono=telefono;
        this.estadoCivil=ec;
        this.pareja=pareja;

        if (!comprobarEdad()){
            throw new IllegalArgumentException("Edad incorrecta");
        }
        if (!comproabarEstadoCivil()){
            throw new IllegalArgumentException("Estado civil incorrecto");
        }

    }

    private boolean comprobarEdad(){
        return this.edad>0;
    }
    private boolean comproabarEstadoCivil(){
        return !((this.pareja != null && this.estadoCivil.equals(EstadoCivil.SOLTERO)) ||
                (this.pareja==null && this.estadoCivil.equals(EstadoCivil.CASADO)));
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getApellido() {
        return this.apellido1;
    }

    @Override
    public String getApelliod2() {
        return this.apellido2;
    }

    @Override
    public Direccion getDireccion() {
        return this.direccion;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        return this.estadoCivil;
    }

    @Override
    public Persona getPareja() {
        return this.pareja;
    }
}
