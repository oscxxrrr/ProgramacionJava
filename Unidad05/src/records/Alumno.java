package records;

public record Alumno (int numeroMaatricula, String nombre, int edad, String direccion, boolean repetdidor){
    public Alumno{
        if (edad <= 0){
            throw new IllegalArgumentException("Edad tiene que ser positiva");
        }
    }
    public Alumno(int nm, String n, int e, String d){
        this(nm,n,e,d,false);
    }
    public boolean menorEdad(){
        return this.edad<18;
    }
}
