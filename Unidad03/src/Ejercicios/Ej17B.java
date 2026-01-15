package Ejercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Ej17B {
    public static void main(String[] args) {
        System.out.println("Numero del mes: ");
        int mes = new Scanner(System.in).nextInt();

        System.out.println("Numero del año: ");
        int year = new Scanner(System.in).nextInt();
        int dia = 1;

        LocalDate date = LocalDate.of(year, mes, dia);
        int numDias = date.lengthOfMonth();
        if (mes >= 1 && mes <= 12) {
            while (dia <= numDias) {
                System.out.println(dia + "/" + mes + "/" + year);
                dia++;
            }
        } else {
            System.out.println("Introduce un mes valido");
        }
    }
}
