package tema5.ej3marcadorBaloncesto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.SimpleTimeZone;

public class MarcadorBaloncesto {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;

    public MarcadorBaloncesto(String nL, String nV){

        this(nL,0,nV,0,LocalDate.now());
    }
    public MarcadorBaloncesto(String nL, String nV, LocalDate f) {
        this(nL,0,nV,0,f);
    }
    public MarcadorBaloncesto(String nL, int pL, String nV, int pV, LocalDate f){
        this.nombreLocal = nL;
        this.puntosLocal = pL;
        this.nombreVisitante = nV;
        this.puntosVisitante = pV;
        this.fecha = f;
    }

    public void añadirCanasta(char equipo, int puntos){
        if (puntos>=1 && puntos<=3){
            if (equipo == 'L'){
                this.puntosLocal+=puntos;
            } else if (equipo == 'V') {
                this.puntosVisitante += puntos;
            }else {
                throw new IllegalArgumentException("Equipo introducidos incorrectamente");
            }
        } else {
            throw new IllegalArgumentException("Puntos introducidos incorrectamente");
        }

    }

    public void reset(){
        this.puntosVisitante = 0;
        this.puntosLocal = 0;
    }
    public String getNombreLocal(){
        return this.nombreLocal;
    }
    public String getNombreVisitante(){
        return this.nombreVisitante;
    }

    public int getPuntosLocal(){
        return this.puntosLocal;
    }
    public int getPuntosVisitante(){
        return this.puntosVisitante;
    }
    public boolean ganaLocal(){
        boolean ganador = false;
        if (this.puntosLocal > this.puntosVisitante){
            ganador = true;
        }
        return ganador;
    }

    public boolean ganaVisitante(){
        boolean ganador = false;
        if (this.puntosLocal < this.puntosVisitante){
            ganador = true;
        }
        return ganador;
    }

    public boolean hayEmpate(){
        boolean empate = false;
        if (this.puntosLocal == this.puntosVisitante){
            empate = true;
        }
        return empate;
    }

    public LocalDate getFecha(){
        return this.fecha;
    }

    public void guardar(String ruta)throws IOException{
        File file = new File(ruta + ".txt");
        PrintWriter pr = new PrintWriter(file);
        pr.println(this.nombreLocal + ":" + this.puntosLocal + " - " + this.nombreVisitante + ":" + this.puntosVisitante);
        pr.close();
    }




}
