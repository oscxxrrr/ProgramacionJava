import com.bpc.cartalib.Carta;
import com.bpc.cartalib.GeneradorBaraja;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
            //JUGADORES
        int[] jugador1Num = new int[20];
        char[] jugador1Palo = new char[20];
        int[] jugador2Num = new int[20];
        char[] jugador2Palo = new char[20];

        //Apartado 1
        char[] palos = {'O', 'C', 'E', 'B'};
        int[] excluidos = {8,9};
        GeneradorBaraja creadorBaraja = new GeneradorBaraja();
        creadorBaraja.setNumeroInicial(1);
        creadorBaraja.setNumeroFinal(12);
        creadorBaraja.setNumerosExcluidos(excluidos);
        creadorBaraja.setPalos(palos);
        List<Carta> baraja = creadorBaraja.generarBaraja();

        //Apartado 2
        Collections.shuffle(baraja);
        int numero = 0;
        char palo = 0;

        //Apartado 3 - Repartiendo cartas
        for (int i = 0; i < baraja.size(); i++) {
            if (i<20){
                Carta carta = baraja.get(i);
                numero = carta.getNumero();
                palo = carta.getPalo();
                for (int j = 0; j < jugador1Num.length; j++) {
                    jugador1Num[i] = numero;
                    jugador1Palo[i] = palo;
                }

            } else {
                Carta carta = baraja.get(i);
                numero = carta.getNumero();
                palo = carta.getPalo();
                for (int j = 0; j < jugador2Num.length; j++) {
                    jugador2Num[j] = numero;
                    jugador2Palo[j] = palo;
                }
            }
        }
        //ENSEÑANDO CARTAS
        System.out.println("RONDA 1\n");
        System.out.println("Cartas jugador 1: ");
        for (int i = 0; i < jugador1Num.length; i++) {
            System.out.println(jugador1Num[i] + " - " + jugador1Palo[i]);
        }
        System.out.println("------------------");
        System.out.println("Cartas jugador 2: ");
        for (int i = 0; i < jugador2Num.length; i++) {
            System.out.println(jugador2Num[i] + " - " + jugador2Palo[i]);
        }

        //SACANDO CARTAS
        int cartas1 = 20;
        int cartas2 = 20;
        boolean repetir = true;
        int cont = 1;
        while (repetir){
            System.out.println("Quieres empezar la ronda " + cont + "? (si/no)");
            cont++;
            String opcion = new Scanner(System.in).nextLine();
            if (opcion.equalsIgnoreCase("si")){
                int paloRandomJugador1 = new Random().nextInt(jugador1Num.length);
                int numeroRandomJugador1 = new Random().nextInt(jugador1Num.length);
                System.out.println("Jugador 1 ha sacado el " + jugador1Num[numeroRandomJugador1] + " de " + jugador1Palo[paloRandomJugador1]);

                int paloRandomJugador2 = new Random().nextInt(jugador1Num.length);
                int numeroRandomJugador2 = new Random().nextInt(jugador1Num.length);
                System.out.println("Jugador 2 ha sacado el " + jugador2Num[numeroRandomJugador2] + " de " + jugador2Palo[paloRandomJugador2]);
                System.out.println("Recuento total: \nJugador 1: " + cartas1 + "\nJugador 2: " + cartas2);
                if (jugador1Num[numeroRandomJugador1] < jugador2Num[numeroRandomJugador2]){
                    System.out.println("\nHa ganado la ronda el jugador 2");
                    cartas2++;
                    cartas1--;
                } else if (jugador1Num[numeroRandomJugador1] > jugador2Num[numeroRandomJugador2]) {
                    cartas1++;
                    cartas2--;
                    System.out.println("\nHa ganado la ronda el jugador 1");
                }
            } else if (opcion.equalsIgnoreCase("no") || cartas2 == 0 || cartas1 == 0) {
                repetir = false;
                System.out.println("saliendo del juego ...");
            }
        }


        if (cartas1<cartas2){
            System.out.println("El ganador de la partida es: Jugador 2" + cartas1 + " - " + cartas2);
        } else if (cartas2<cartas1) {
            System.out.println("El ganador de la partida es: Jugador 1" + cartas1 + " - " + cartas2);
        }else {
            System.out.println("EMPATE " + cartas1 + " - " + cartas2);
        }
    }
}
