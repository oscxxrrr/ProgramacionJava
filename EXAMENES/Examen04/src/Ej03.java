import java.util.Random;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        int[][] pepe = {
                {1,4,9,5},
                {2,7,3,2},
                {1,9,4,6},
                {3,2,1,3}
        };


        int[][] maikel = {
                {1,2,3,4},
                {4,1,2,3},
                {3,4,1,2},
                {2,3,4,1}
        };

        int[][] petronila = {
                {9,2,1,3},
                {6,3,6,3},
                {3,5,6,1},
                {1,2,6,8}
        };

        System.out.println("Introduce tu nombre: ");
        String nombre = new Scanner(System.in).nextLine();

        int filas = 0;
        int columnas = 0;
        if (nombre.equalsIgnoreCase("pepe") || nombre.equalsIgnoreCase("maikel") || nombre.equalsIgnoreCase("petronila")){
            filas = new Random().nextInt(pepe.length);
            columnas = new Random().nextInt(pepe[0].length);
            System.out.println("Dime que numero se encuentra en la fila: " + (filas + 1) + " y columna: " + (columnas + 1));
            int numeroCliente = new Scanner(System.in).nextInt();

            if (nombre.equalsIgnoreCase("pepe")){
                if (pepe[filas][columnas] == numeroCliente){
                    System.out.println("acceso permitido pepe");
                }else {
                    System.out.println("acceso denegado pepe");
                }
            }

            if (nombre.equalsIgnoreCase("maikel")){
                if (maikel[filas][columnas] == numeroCliente){
                    System.out.println("acceso permitido maikel");
                }else {
                    System.out.println("acceso denegado maikel");
                }
            }

            if (nombre.equalsIgnoreCase("petronila")){
                if (petronila[filas][columnas] == numeroCliente){
                    System.out.println("acceso permitido petronila");
                }else {
                    System.out.println("acceso denegado petronila");
                }
            }
        }else {
            System.out.println("Ese nombre no esta registrado.");
        }

    }
}
