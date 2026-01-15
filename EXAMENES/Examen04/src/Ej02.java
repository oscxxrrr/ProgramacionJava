import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ej02 {
    public static void main(String[] args) {
        LocalDate[] fechas = {LocalDate.of(2024,7,9), LocalDate.of(2026,1,3), LocalDate.of(2025,12,15), LocalDate.of(2026,3,25), LocalDate.of(2027,6,30)};
        LocalDate[] enero = new LocalDate[32];

        for (int i = 1; i <= enero.length-1; i++) {
            enero[i] = LocalDate.of(2026,1,i);
        }

        for (int i = 1; i <= enero.length-1; i++) {
            System.out.println(enero[i]);
        }

        LocalDate fechaHoy = LocalDate.now();
        System.out.println("\nLas fechas anteriores a la fecha de hoy (" + fechaHoy+") son: ");
        for (int i = 0; i < fechas.length; i++) {
            if (fechas[i].isBefore(fechaHoy)){
                System.out.println(fechas[i]);
            }
        }

        System.out.println("\nLos dias que caen en finde son los siguientes: ");
        for (int i = 0; i < fechas.length; i++) {
            DayOfWeek dia = fechas[i].getDayOfWeek();
            int num = dia.getValue();

            if (num == 6 || num == 7){
                System.out.println(fechas[i]);
            }
        }

        LocalDate antigua = null;
        for (int i = 0; i < fechas.length; i++) {
            if (i == 0){
                antigua = fechas[i];
            }else {
                if (fechas[i].isBefore(antigua)){
                    antigua = fechas[i];
                }
            }
        }
        System.out.println("\nLa fecha mas antigua registrada es --> " + antigua);


        System.out.println("Las fechas registradas en el primer apartado que coincidan con el segundo apartado son: ");
        for (int i = 1; i <= enero.length-1; i++) {
            int dia = enero[i].getDayOfMonth();
            int mes = enero[i].getMonthValue();
            int year = enero[i].getYear();

            for (int j = 0; j < fechas.length; j++) {
                if (dia == fechas[j].getDayOfMonth() && mes == fechas[j].getMonthValue() && year == fechas[j].getYear()){
                    System.out.println(fechas[j]);
                }
            }
        }
    }
}
