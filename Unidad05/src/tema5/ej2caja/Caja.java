package tema5.ej2caja;

import java.util.Locale;

public class Caja {
    private boolean abierto;
    private String mensaje;

    public Caja(String m){
        this(false, m);
    }

    public Caja(boolean a, String m){
        this.mensaje = m;
        this.abierto = a;
    }

    public Caja(){
        this(false,"Viva el tema 4");
    }

    public void setMensaje(String m){
        if (this.abierto){
            this.mensaje = m;
        }
    }
    public void pasarMayusucula(){
        if (this.abierto){
            this.mensaje = this.mensaje.toUpperCase();
        }

    }

    public boolean estaAbierta(){
        return this.abierto;
    }

    public String getMensaje() {
        return this.abierto? this.mensaje:null;
    }
}
