package tema5.Ej43_44_45marcador;

public class MarcadorFacil implements MarcadorBaloncesto{
    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;

    public MarcadorFacil(String local, String visitante){
        this.nombreEquipoLocal = local;
        this.nombreEquipoVisitante = visitante;
        this.puntosLocal = 0;
        this.puntosVisitante = 0;
    }


    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        if (e == null || t == null) {
            throw new IllegalArgumentException("Equipo o canasta nulos");
        }

        if (e == TipoEquipo.LOCAL) {
            puntosLocal = puntosLocal + t.getValor();
        } else {
            puntosVisitante = puntosVisitante + t.getValor();
        }
    }

    @Override
    public String getNombreEquipo(TipoEquipo e) {
        return TipoEquipo.VISITANTE.equals(e)? this.nombreEquipoVisitante:this.nombreEquipoLocal;
    }

    @Override
    public int getPuntos(TipoEquipo e) {
        return TipoEquipo.VISITANTE.equals(e)? this.puntosVisitante:this.puntosLocal;
    }

    @Override
    public String getMarcador() {
        return MarcadorBaloncesto.super.getMarcador();
    }
}
