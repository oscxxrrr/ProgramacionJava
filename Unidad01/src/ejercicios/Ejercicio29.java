package ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args){

        System.out.println("Esta encendida la impresora? (responde con: true or false)");
        boolean encendidaSiNo = new Scanner(System.in).nextBoolean();

        System.out.println("Cuanto porcentaje de tinta tiene la impresora? ");
        int porcentajeTinta = new Scanner(System.in).nextInt();
        boolean comprobacionTinta = porcentajeTinta >= 10;

        System.out.println("Cuantos folios tiene la impresora? ");
        int foliosImpresora = new Scanner(System.in).nextInt();
        System.out.println("Cuantos folios necesitas? ");
        int foliosNecesarios = new Scanner(System.in).nextInt();

        boolean comprobacionFolios = (foliosImpresora >= foliosNecesarios);

        System.out.println("Puedes imprimir? " + (encendidaSiNo && comprobacionTinta && comprobacionFolios));

    }
}
