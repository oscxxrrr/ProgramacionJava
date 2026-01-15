package Ejercicios;

import java.net.InetAddress;
import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Introduce la direccion IP:");
        String IP = new Scanner(System.in).nextLine();
        System.out.println("Introduce el tiempo timeout en milisegundos:");
        int milisegundos = new Scanner(System.in).nextInt();

        try {
            InetAddress direccion = InetAddress.getByName(IP);
            boolean ping = direccion.isReachable(milisegundos);
            System.out.println("Haciendo ping a "+IP+" en " + milisegundos +" milisegundos........= " + ping);
        }catch (Exception e){
            System.out.println("Error");
        }


    }
}
