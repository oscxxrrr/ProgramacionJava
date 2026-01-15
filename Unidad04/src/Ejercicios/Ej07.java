package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import bpc.daw.reproductor.* ;
public class Ej07 {
    public static void main(String[] args) {
        int cont = 10;
        List<ArchivoMP3> listaCanciones = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Cancion " + i + ": (introduce " + (cont--)+")");
            String cancion = new Scanner(System.in).nextLine() + ".mp3";
            ArchivoMP3 archivoMP3 = new ArchivoMP3(cancion);
            listaCanciones.add(archivoMP3);
        }

        boolean repetir = true;
        while (repetir){
            System.out.println("Menu canciones:");
            for (int i = 0; i < listaCanciones.size(); i++) {
                ArchivoMP3 titulo = listaCanciones.get(i);
                System.out.println((i+1) + ": " + titulo);
            }
            System.out.println("11: Salir del programa");
            System.out.println("Elige una opcion: ");
            int opcion = new Scanner(System.in).nextInt();
            if (opcion < 1 && opcion > 10){
                repetir = false;
            } else if (opcion == 11) {

                System.out.println("Saliendo del programa...");
                repetir = false;
            }else {
                ArchivoMP3 archivo = listaCanciones.get(opcion);
                Reproductor reproductor = new Reproductor(archivo, false, false);
                reproductor.play();
            }
        }
    }
}
