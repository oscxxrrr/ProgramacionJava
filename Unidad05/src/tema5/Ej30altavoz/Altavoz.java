package tema5.Ej30altavoz;

public class Altavoz {
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;
    private int volumen;

    public Altavoz(){
        this.volumen = 0;
    }
    public void ponerVolumenMaximo(){
        this.volumen = VOL_MAX;
    }
    public void ponerVolumen(int v){
        if (v > VOL_MAX || v < VOL_MIN){
            throw new IllegalArgumentException("Volumen introducido incorrecto");
        }
        this.volumen = v;
    }
    public int getVolumen(){
        return this.volumen;
    }
    public String toString(){
        String resultado = " ";
        int x = this.volumen * 10 / Altavoz.VOL_MAX;
        for (int i = 0; i < x; i++) {
            resultado+="x";
        }
        for (int i = 0; i < (10-x); i++) {
            resultado+="-";
        }

        return ("[" + this.volumen + "]" + resultado);
    }
}
