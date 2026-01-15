package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args){
        final int PORCENTAJE_TEORIA = 40;
        final int PORCENTAJE_PROBLEMAS = 60;
        final int PREGUNTAS_TOERIA = 8;
        final int PREGUNTAS_PROBLEMAS = 4;
        int preguntasTeoriaBien = 0;
        int preguntasProblemasBien = 0;
        double notaTeoria = 0;
        double notaProblemas = 0;
        double notaFinal = 0;

        System.out.println("Introduce cuantas preguntas de toeria tienes bien: ");
        preguntasTeoriaBien = new Scanner(System.in).nextInt();
        System.out.println("Introduce cuantas preguntas de los problemas tienes bien: ");
        preguntasProblemasBien = new Scanner(System.in).nextInt();

        notaTeoria = preguntasTeoriaBien * 10.0 / 8;
        notaProblemas = preguntasProblemasBien * 10.0 / 6;

        notaFinal = ((notaTeoria * PORCENTAJE_TEORIA)/100) + ((notaProblemas * PORCENTAJE_PROBLEMAS)/100);

        System.out.println("La nota de teoria es: " + notaTeoria);
        System.out.println("La nota de problemas es: " + notaProblemas);
        System.out.println("La nota final es: " + notaFinal);
    }
}
