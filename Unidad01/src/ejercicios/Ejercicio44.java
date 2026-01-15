package ejercicios;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args){
        int numeroLista = 0;
        final int ANTONIO_SUSPENSOS = 3;
        final int JAIME_SUSPENSOS = 8;
        final int PEDRO_SUSPENSOS = 2;
        final int MANUEL_SUSPENSOS = 0;
        final int MAITE_SUSPENSOS = 0;

        System.out.println("Introduce un numero del 1-5 de la lista: ");
        numeroLista = new Scanner(System.in).nextInt();

        if(numeroLista == 1){
            System.out.println("Has seleccionado a Antonio:\nNumero suspensos: "+ANTONIO_SUSPENSOS+"\nNo pasas de curso.");
        } else if (numeroLista == 2) {
            System.out.println("Has seleccionado a Jaime:\nNumero suspensos: "+JAIME_SUSPENSOS+"\nNo pasas de curso.");
        }else if (numeroLista == 3) {
            System.out.println("Has seleccionado a Pedro:\nNumero suspensos: "+PEDRO_SUSPENSOS+"\nNo pasas de curso.");
        }else if (numeroLista == 4) {
            System.out.println("Has seleccionado a Manuel:\nNumero suspensos: "+MANUEL_SUSPENSOS+"\nPasas de curso.");
        }else if (numeroLista == 5) {
            System.out.println("Has seleccionado a Maite:\nNumero suspensos: "+MAITE_SUSPENSOS+"\nPasas de curso.");
        }

    }
}
