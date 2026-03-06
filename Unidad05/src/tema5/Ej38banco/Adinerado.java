package tema5.Ej38banco;

public interface Adinerado {
    public static int TRANSFERENCIA_MINIMA = 1526;

    public abstract double getDineroTotal();
    public abstract boolean añadirDinero(int cantidad);
    public abstract boolean retirarDinero(int cantidad);

    default boolean tieneDinero(){
        return getDineroTotal()>0;
    }
    default boolean transferirHacia(Adinerado receptor, double cantidad){
        boolean resultado;
        if (cantidad < Adinerado.TRANSFERENCIA_MINIMA){
            resultado = false;
        }else {
            this.retirarDinero((int)cantidad);
            receptor.añadirDinero((int)cantidad);
            resultado = true;
        }
        return resultado;
    }
    default boolean transferirDesde(Adinerado emisor, double cantidad){
        return emisor.transferirHacia(this, (int)cantidad);
    }

    public static boolean transferir(Adinerado emisor, Adinerado receptor, double cantidad){
        return emisor.transferirHacia(receptor, (int)cantidad);
    }
}
