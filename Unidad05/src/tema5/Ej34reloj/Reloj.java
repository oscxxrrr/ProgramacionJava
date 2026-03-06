package tema5.Ej34reloj;

import java.time.LocalTime;

public class Reloj {
    private LocalTime hora;

    public Reloj(LocalTime h){
        this.hora = h;
    }

    public Reloj(){
        this.hora = LocalTime.now();
    }

    public LocalTime getHora(){
        return this.hora;
    }

    public void añadirSegundos(int segundos){
        this.hora = this.hora.plusSeconds(segundos);
    }

    public boolean esNoche(){
        return this.hora.isAfter(LocalTime.of(20, 0)) || this.hora.isBefore(LocalTime.of(8, 0));
    }

    public void esperar(int segundos){
        int milisegundos = segundos * 1000;
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            throw new IllegalArgumentException("ERROR INESPERADO");
        }
        this.añadirSegundos(segundos);
    }

    public String toString(){
        return this.hora.toString();
    }
}
