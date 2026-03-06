package tema5.ej7cuentaCorriente;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Random;

public class CuentaCorriente {
    public int número;
    public double saldo;

    public CuentaCorriente(){
        this(new Random().nextInt(0,1001), 0.0);
    }
    public CuentaCorriente(int número){
        this(número, 0.0);
    }

    public CuentaCorriente(int número, double saldo){
        this.número = número;
        this.saldo = saldo;
    }

    public void añadirDinero(int cantidad){
        this.saldo = cantidad>0? (cantidad + 0.0) + saldo:0;
    }

    public void retirarDinero(int cantidad)throws IOException {
        if (cantidad > saldo){
            throw new IOException("No puedes retirar mas dinero del que tienes");
        }
        this.saldo = saldo - cantidad;
    }

}
