package ejercicios;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args){
        double precioArticulo = 0;
        double dineroCliente = 0;

        System.out.println("Introduce el precio del articulo: ");
        precioArticulo = new Scanner(System.in).nextDouble();
        System.out.println("Introduce cuanto dinero tienes: ");
        dineroCliente = new Scanner(System.in).nextDouble();

        if(precioArticulo > dineroCliente){
            System.out.println("Le falta dinero para comprar el articulo.\nCantidad necesaria: "+precioArticulo);
        } else if (precioArticulo <= dineroCliente) {
            System.out.println("Le tengo que dar cambio\nCantidad necesaria:" +precioArticulo);
        }

    }
}
