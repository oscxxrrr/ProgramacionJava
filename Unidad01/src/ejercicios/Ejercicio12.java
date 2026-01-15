package ejercicios;

import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args){
        System.out.println("Introduce el precio del articulo: ");
        double precioNormal = new Scanner(System.in).nextDouble();
        System.out.println("Introduce el porcentaje de rebaja: ");
        double porcentajeRebaja = new Scanner(System.in).nextDouble();
        double descuentoAplicado = precioNormal * porcentajeRebaja / 100;
        double precioFinal = precioNormal - descuentoAplicado;
        System.out.println("Precio normal del articulo: " + precioNormal + " euros");
        System.out.println("Porcetnaje de rebaja aplicado: " + porcentajeRebaja + "%");
        System.out.println("Descuento aplicado: " + descuentoAplicado + " euros");
        System.out.println("Precio final del articulo: " + precioFinal + " euros");
    }
}
