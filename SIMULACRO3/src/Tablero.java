import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public interface Tablero {
    public abstract int getNumeroFilas();
    public abstract int getNumeroColumnas();
    public abstract TipoTablero getTipo();
    public abstract Celula getCelula(int columna, int fila);
    public abstract void ponerCelulaViva(int columna, int fila);
    public abstract void ponerCelulaMuerta(int columna, int fila);
    public default int contarNumeroCasillas(){
        return this.getNumeroColumnas()*this.getNumeroFilas();
    }
    public default ConjuntoCelulas getVecindario(Celula c){
        int fil = c.linea();
        int col = c.columna();
        List<Celula> listaCel = new ArrayList<>();
        for (int i = 0; i < this.contarNumeroCasillas(); i++) {
            for (int j = 0; j < this.contarNumeroCasillas(); j++) {
                if(i>=0 && i<this.getNumeroFilas() &&
                        j>=0 && j<this.getNumeroColumnas()
                        && (i!=c.linea() || j!=c.columna())){
                    listaCel.add(this.getCelula(i,j));
                }
            }
        }
        return new ConjuntoCelulas(listaCel);
    }

    public default void rellenarAleatoriamente(int porcentajeVidas){
        int num = (int) ((double) (int) porcentajeVidas /this.contarNumeroCasillas() *100.0);
        for (int i = 0; i < num; i++) {
            int fila = new Random().nextInt(getNumeroFilas());
            int col = new Random().nextInt(getNumeroColumnas());
            ponerCelulaViva(fila,col);
        }
    }


}
