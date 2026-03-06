package tema5.Ej36examen;

import java.util.HashMap;
import java.util.Map;

public class Examen {
    private String nombre;
    private Map<String,String> respuestas;

    public Examen(String nombre){
        this.nombre = nombre;
        this.respuestas = new HashMap<>();
    }

    public Examen(Examen c){
        this.nombre = c.nombre;
        this.respuestas = c.respuestas;
    }

    public void responder(String pregunta, String respuesta){
        this.respuestas.put(pregunta,respuesta);
    }

    public String getRespuesta(String pregunta){
        return this.respuestas.get(pregunta);
    }

    public double calificar(Map<String, String> respuestasCorrectas){
        int aciertos = 0;

        for (String pregunta : respuestasCorrectas.keySet()) {
            if (respuestasCorrectas.get(pregunta).equals(this.respuestas.get(pregunta))) {
                aciertos++;
            }
        }
        return (double) aciertos / respuestasCorrectas.size() * 10;

    }

}