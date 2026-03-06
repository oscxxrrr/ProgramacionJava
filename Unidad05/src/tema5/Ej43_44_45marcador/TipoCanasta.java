package tema5.Ej43_44_45marcador;

public enum TipoCanasta {
    TIRO_LIBRE, CANASTA_NORMAL, TRIPLE;
    public int getValor(){
        return this.ordinal() + 1;
    }
}
