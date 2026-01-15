import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        System.out.println("Introduce una fehca: (dia/mes/año)");//Dias 2 digitos, mes 2 digitos y año 4 digitos.
        String fecha1 = new Scanner(System.in).nextLine();
        LocalDate localDate = LocalDate.parse(fecha1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int year = localDate.getYear();
        int mes = localDate.getMonthValue();
        if (mes >= 9 && mes <= 12){
            System.out.println("El mes " + mes + " pertenece al curso " + year + "/" + (year + 1));
        } else if (mes==7 && mes==8) {
            System.out.println("El mes " + mes + " pertenece al verano");
        }else {
            System.out.println("El mes " + mes + " pertenece al curso " + (year-1) + "/" + year);
        }


    }
}
