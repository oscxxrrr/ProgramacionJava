package tema5.Ej46examen;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    private List<String> alumnos;
    private List<Double> notas;

    public Examen(){
        this.alumnos = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    public void añadirNota(String alumno, double nota){
        if (nota <0 || nota > 10){
            throw new IllegalArgumentException("Nota introducida incorrecta");
        }
        this.alumnos.add(alumno);
        this.notas.add(nota);
    }
    public double getNota(String alumno){
        if (!this.alumnos.contains(alumno)){
            throw new IllegalArgumentException("Este alumno no esta");
        }
        return this.notas.get(this.alumnos.indexOf(alumno));
    }
    public double getNodaMedia(){
        if (this.alumnos.isEmpty()){
            throw new IllegalArgumentException("Este alumno no esta");
        }
        double suma = 0;
        for (int i = 0; i < this.alumnos.size(); i++) {
            suma = suma + this.notas.get(i);
        }
        return suma/this.notas.size();
    }
    public boolean mediaAprobado(){
        return this.getNodaMedia() >= 5;
    }
    public List<String> getAprobados(){
        List aprobados = new ArrayList<>();
        for (int i = 0; i < this.alumnos.size(); i++) {
            if (this.notas.get(i) >= 5){
                aprobados.add(this.alumnos.get(i));
            }
        }
        return aprobados;
    }
}
