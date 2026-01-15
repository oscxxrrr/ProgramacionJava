package Ejercicios;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.*;

import java.awt.*;
import java.time.LocalTime;

public class Ej23 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();

        try {
            boolean repetir = true;
            while (repetir){
                LocalTime localTime = LocalTime.now();
                int hora = localTime.getHour();
                int minutos = localTime.getMinute();
                int segundos = localTime.getSecond();
                texto.setColorTexto(Color.white);
                texto.printct(15, hora+":"+minutos+":"+segundos);
                texto.cls();

            }
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
