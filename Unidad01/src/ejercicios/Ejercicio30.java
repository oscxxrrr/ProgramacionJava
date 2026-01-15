package ejercicios;


import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String [] args){
        final double NOTA_1 = 6.5;
        final double NOTA_2 = 4.2;
        final double NOTA_3 = 5.75;
        final double NOTA_4 = 3.5;
        final double NOTA_5 = 8.0;

        double notaMedia = (NOTA_1 + NOTA_2 + NOTA_3 +NOTA_4 + NOTA_5) / 5;

        System.out.println("Introduce el numero de faltas que tengas: ");
        int numeroFaltas = new Scanner(System.in).nextInt();

        System.out.println("Tu nota media es: "+ notaMedia);
        if(numeroFaltas <= 10 ){
            System.out.println("Estas entre 0 y 10 faltas, has aprobado? ");
            boolean aprobado = notaMedia >= 5;
            System.out.println(aprobado);

        } else if (numeroFaltas > 10 && numeroFaltas <= 20) {
            System.out.println("Estas entre 10 y 20 faltas, has aprobado? ");
            boolean aprobado = notaMedia >= 7;
            System.out.println(aprobado);

        } else if (numeroFaltas > 20) {
            System.out.println("Estas suspendido porque has alcanzado el numero de 20 faltas.");
        }

    }
}
