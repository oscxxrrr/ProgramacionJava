package ejercicios;

import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args){
        System.out.println("Introduce los grados Centigrados: ");
        int gradosCentigrados = new Scanner(System.in).nextInt();

        double centigradosAfarenheit = ( gradosCentigrados * 9.0/5) +32;

        System.out.println("Los grados introducidos: " + gradosCentigrados + "\nPasados a farenheit son: " + centigradosAfarenheit);
    }
}
