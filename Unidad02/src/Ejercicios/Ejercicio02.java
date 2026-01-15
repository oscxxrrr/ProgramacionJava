package Ejercicios;
import bpc.daw.mario.*;
public class Ejercicio02 {
    public static void main(String[] args){
        Mario mario1 = new Mario(100 );
        Mario mario2 = new Mario(640, 320);
        Seta seta1 = new Seta(0, 0);
        Cañon c1 = new Cañon(100 ,320);
        Planta planta1 = new Planta(400, 500);
        Planta planta2 = new Planta(450, 500);
        Planta planta3 = new Planta(500, 500);
        Luigi l1 = new Luigi(200);
        Mario mario3 = new Mario(l1, 50);

    }
}
