package tema5.ej28Matricula;

public class Matricula {
    public static int siguienteNúmeroMarticula = 1;
    private int númeroMarticula;
    private String nombreAlumno;
    private String nombreAsignatura;

    public Matricula(String nombreAlumno, String nombreAsignatura){
        this.númeroMarticula = Matricula.siguienteNúmeroMarticula++;
        this.nombreAlumno = nombreAlumno;
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNombreAlumno(){
        return this.nombreAlumno;
    }
    public String getNombreAsignatura(){
        return this.nombreAsignatura;
    }
    public int getNúmeroMarticula(){
        return this.númeroMarticula;
    }
}
