package Ejercicios;

import java.net.InetAddress;
import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        System.out.println("Introduce el nombre del equipo:");
        String nombreEquipo = new Scanner(System.in).nextLine();

        try {
            InetAddress direccion = InetAddress.getByName(nombreEquipo);
            String ipEquipo = direccion.getHostAddress();
            System.out.println("La ip es: " + ipEquipo);
        }catch (Exception e){
            System.out.println("Error, equipo no encontrado");
        }
    }
}
