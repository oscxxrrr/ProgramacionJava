package Practicas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
import java.util.Set;

public class Practica03 {
    public static void main(String[] args) {
        System.out.println("Introduce una hora: (hora:minutos)");
        String hora = new Scanner(System.in).nextLine();
        ZoneId zoneld = ZoneId.of("America/Los_Angeles");
       // ZonedDateTime.now(hora);
        ZonedDateTime horaAngeles = ZonedDateTime.now(zoneld);
        System.out.println(horaAngeles);
    }
}
