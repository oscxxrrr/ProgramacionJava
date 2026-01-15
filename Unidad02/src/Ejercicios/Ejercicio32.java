package Ejercicios;
import bpc.daw.reproductor.*;

public class Ejercicio32 {
    public static void main(String[] args) {
        boolean sincrono = false;
        boolean info = true;
        ArchivoMP3 archivoMP3 = new ArchivoMP3("Remedio.mp3");
        Reproductor reproductor = new Reproductor(archivoMP3, sincrono, info);
        reproductor.play();
        String tituloCanacion = archivoMP3.getTitulo();
        String autorCancion = archivoMP3.getAutor();
        long duracion = archivoMP3.getDuracion();
        System.out.println("Titulo de la cancion:"+ tituloCanacion + "\nCantante: " + autorCancion + "\nDuracion de la cancion: " + duracion + " milisegundos");

    }
}
