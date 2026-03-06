import java.util.List;

public record ConjuntoCelulas(List<Celula> vecinos) {
    public int contarCelulisaVivas(){
        int cont = 0;
        for (int i = 0; i < this.vecinos.size(); i++) {
            if (this.vecinos.get(i).estado() == Estado.VIVO){
                cont++;
            }
        }
        return cont;
    }

    public int contarCelulisaMuertas(){
        int cont = 0;
        for (int i = 0; i < this.vecinos.size(); i++) {
            if (this.vecinos.get(i).estado() == Estado.MUERTO){
                cont++;
            }
        }
        return cont;
    }
}
