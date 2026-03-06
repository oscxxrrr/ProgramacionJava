package tema5.Ej43_44_45marcador;

public interface MarcadorBaloncesto {
    public abstract void añadirCanasta(TipoEquipo e, TipoCanasta t);
    public abstract String getNombreEquipo(TipoEquipo e);
    public int getPuntos(TipoEquipo e);
    public default String getMarcador() {
        return getNombreEquipo(TipoEquipo.LOCAL)+ " " + getPuntos(TipoEquipo.LOCAL)+ " - " + getNombreEquipo(TipoEquipo.VISITANTE)+ " " + getPuntos(TipoEquipo.VISITANTE);
    }

}
