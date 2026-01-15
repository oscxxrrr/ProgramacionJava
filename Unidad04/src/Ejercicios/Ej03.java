package Ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        int numero = new Scanner(System.in).nextInt();
        List<String> lista = new ArrayList<>();
        if (numero >= 1 && numero <= 12){
            LocalDate localDate = LocalDate.of(2025,numero,1);
            int numDias = localDate.lengthOfMonth();
            for (int i = 1; i <= numDias; i++) {
                String date = i + "/" + numero + "/" + localDate.getYear();
                lista.add(date);
            }
        }else {
            System.out.println("Debes introducir un numero entre 1 y 12.");
        }

        System.out.println(lista);
    }
}
