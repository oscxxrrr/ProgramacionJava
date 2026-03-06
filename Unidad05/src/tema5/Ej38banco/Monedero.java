package tema5.Ej38banco;

public class Monedero implements Adinerado {
    private double dinero;

    public Monedero(){
        this.dinero = 0;
    }

    @Override
    public double getDineroTotal() {
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        boolean respuesta;
        if (cantidad + this.dinero > 1000){
            respuesta = false;
        }else {
            this.dinero = this.dinero + cantidad;
            respuesta = true;
        }
        return respuesta;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        boolean respuesta;
        if (cantidad > this.dinero){
            respuesta = false;
        }else {
            this.dinero = this.dinero - cantidad;
            respuesta = true;
        }
        return respuesta;
    }
}
