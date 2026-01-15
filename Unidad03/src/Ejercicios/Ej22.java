package Ejercicios;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {


        try {
            System.out.println("Introduce la cantidad de ping que quieres realizar: ");
            int pings = new Scanner(System.in).nextInt();
            System.out.println("Introduce la IP o nomrbe de equipo: ");
            String ip = new Scanner(System.in).nextLine();
            InetAddress inetAddress = InetAddress.getByName(ip);
            String nombreEquipo = inetAddress.getHostName();
            System.out.println("Haciendo ping  a " + nombreEquipo +"[" + ip + "]");
            for (int i = 0; i < pings; i++) {
                try {
                    Instant instant1 = Instant.now();
                    boolean reachable = inetAddress.isReachable(10000);
                    Instant instant2 = Instant.now();
                    Duration duration = Duration.between(instant1,instant2);
                    long tiempo = duration.toMillis();

                    if (reachable == true){
                        System.out.println("Respuesta deade " + ip + ": tiempo=" + tiempo+"ms");
                    }else {
                        System.out.println("Ip no accesible");
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
    }
}
