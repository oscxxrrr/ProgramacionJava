package Ejercicios;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio45 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2100,2,28);
        DayOfWeek day = localDate.getDayOfWeek();
        String nombreDia = day.name();
        System.out.println("El 28 de febrero de 2100 cae en dia: " + nombreDia);
    }
}
