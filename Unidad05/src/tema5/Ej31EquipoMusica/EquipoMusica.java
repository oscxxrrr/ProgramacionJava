package tema5.Ej31EquipoMusica;

import tema5.Ej30altavoz.Altavoz;

public class EquipoMusica {
    private Altavoz[] altavoces;

    public EquipoMusica(int numeroAltavoces){
        this.altavoces = new Altavoz[numeroAltavoces];
        for (int i = 0; i < numeroAltavoces; i++) {
            this.altavoces[i] = new Altavoz();
        }
    }

    public Altavoz getAltavoz(int posición){
        return this.altavoces[posición];
    }

    public void setVolumen(int numeroAltavoz, int volumen){
        this.altavoces[numeroAltavoz].ponerVolumen(volumen);
    }
}
