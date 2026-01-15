package Ejercicios;

import bpc.daw.musica.*;

public class Ejercicio31 {
    public static void main(String[] args) {

        NotaMusical n1 = new NotaMusical(0, 2);
        NotaMusical n2 = new NotaMusical(4, 2);
        NotaMusical n3 = new NotaMusical(5, 2);
        NotaMusical n4 = new NotaMusical(4, 1);
        NotaMusical n5 = new NotaMusical(3, 3);
        NotaMusical n6 = new NotaMusical(2, 3);
        NotaMusical n7 = new NotaMusical(1, 4);
        NotaMusical n8 = new NotaMusical(2, 4);
        NotaMusical n9 = new NotaMusical(3, 4);

        Cancion cancion1 = new Cancion("Canción 1");
        cancion1.añadir(n1);
        cancion1.añadir(n1);
        cancion1.añadir(n2);
        cancion1.añadir(n2);
        cancion1.añadir(n3);
        cancion1.añadir(n3);
        cancion1.añadir(n4);
        cancion1.añadir(n5);
        cancion1.añadir(n5);
        cancion1.añadir(n6);
        cancion1.añadir(n6);
        cancion1.añadir(n7);
        cancion1.añadir(n8);
        cancion1.añadir(n9);
        cancion1.añadir(n7);
        cancion1.añadir(n1);

        Piano piano1 = new Piano();
        boolean reproducirPiano = piano1.reproducir(cancion1);

        Guitarra guitarra1 = new Guitarra();
        boolean reproducirGuitarra = guitarra1.reproducir(cancion1);
        System.out.println("Fin de la cancion");
    }
}