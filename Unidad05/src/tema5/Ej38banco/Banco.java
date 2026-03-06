package tema5.Ej38banco;

public class Banco implements Adinerado{
    private double dinero;

    public Banco(){
        this.dinero = 0;
    }

    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        this.dinero = this.dinero + cantidad;
        return true;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        boolean resultado;
        if (this.getDineroTotal() < cantidad){
            resultado = false;
        }else {
            this.dinero = this.dinero - cantidad;
            resultado = true;
        }
        return resultado;
    }

}
