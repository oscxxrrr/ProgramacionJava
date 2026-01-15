package Ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {

        System.out.println("Numero del mes: ");
        int mes = new Scanner(System.in).nextInt();

        System.out.println("Numero del año: ");
        int year = new Scanner(System.in).nextInt();
        int dia = 1;

        LocalDate date = LocalDate.of(year, mes, dia);

        int numDias = date.lengthOfMonth();
        if (mes > 1 && mes < 12)
        for (int contador = 0; contador < numDias; contador++) {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("eeee");
            System.out.println(contador + "/" + mes + "/" + year );
        }else{
            System.out.println("Introduce un mes valido");
        }
    }
}
