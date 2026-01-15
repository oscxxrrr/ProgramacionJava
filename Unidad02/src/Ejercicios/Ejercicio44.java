package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio44 {
    public static void main(String[] args) {
        LocalDate horario = LocalDate.now();
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String fecha1 = horario.format(dateTimeFormatter1);
        String fecha2 = horario.format(dateTimeFormatter2);
        System.out.println("Fecha actual con '-': " + fecha2);
        System.out.println("Fehca actual con '/': " + fecha1);
    }
}
