package Ejercicios;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class Ejercicio46 {
    public static void main(String[] args) {
        Random random = new Random();
        int segundos = random.nextInt(0,11);
        try {
            Instant inicio = Instant.now();
            Thread.sleep(segundos * 1000);
            Instant fin = Instant.now();

            Duration duracion = Duration.between(inicio, fin);
            long duracionSegundos = duracion.getSeconds();
            System.out.println("El programa ha durado: " + duracionSegundos + " segundos.");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
