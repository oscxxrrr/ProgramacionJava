package Ej9Adivinanza;

import java.time.Instant;

public class Adivinanza {
    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;

    public Adivinanza(String e, String rc){
        this.enunciado = e;
        this.respuestaCorrecta = rc;
        this.inicio = null;
    }
    public String getEnunciado(){
        this.inicio = Instant.now();
        return this.enunciado;
    }
    public void comprobar(String respuesta) throws TiempoSuperadoException, AdivinanzaIncorrectaException {
        if (respuesta.equalsIgnoreCase(respuestaCorrecta)){
            if (Instant.now().isAfter(this.inicio.plusSeconds(30))){
                throw new TiempoSuperadoException();
            }
        }else {
            throw new AdivinanzaIncorrectaException();
        }
    }

}
