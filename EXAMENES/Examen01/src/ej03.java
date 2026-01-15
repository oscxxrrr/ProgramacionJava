import java.util.Scanner;

public class ej03 {
    public static void main(String[] args){
        int precioArticulo = 0;
        int precioRebajas = 0;
        int porcentaje = 0;

        System.out.println("Introduce el precio del articulo:");
        precioArticulo = new Scanner(System.in).nextInt();
        System.out.println("Introduce el precio del articulo ya rebajado:");
        precioRebajas = new Scanner(System.in).nextInt();

        porcentaje = 100 * precioRebajas / precioArticulo;
        System.out.println("El porcentaje del articulo rebajado es: " + porcentaje);
    }
}
