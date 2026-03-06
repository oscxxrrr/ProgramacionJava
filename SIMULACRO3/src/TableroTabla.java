import java.util.List;

public class TableroTabla {
    private int numeroFilas;
    private int numeroColumnas;
    private List<Celula> celulas;

    private TableroTabla(int numFilas, int numColumnas, int porcVivas){
        this.numeroColumnas = numColumnas;
        this.numeroFilas = numFilas;
        int num = (int)porcVivas/numColumnas*numFilas * 100;
        for (int i = 0; i < num; i++) {

        }
    }
}
