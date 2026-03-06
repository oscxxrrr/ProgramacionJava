public record Celula(int columna, int linea, Estado estado) {
    public Celula{
        if (columna<0 || linea <0){
            throw new IllegalArgumentException("No puede haber columna o fila negativa");
        }
    }
}
