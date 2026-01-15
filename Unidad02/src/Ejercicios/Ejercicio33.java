package Ejercicios;
import bpc.daw.reproductor.*;

import java.io.IOException;

public class Ejercicio33 {
    public static void main(String[] args) {
        try {
            boolean sincrono = true;
            boolean info = true;
            PlayList playlist1 = new PlayList();
            ArchivoMP3 archivo1 = new ArchivoMP3("D:\\GRADO SUPERIOR\\Programacion\\Unidad02\\Remedio.mp3");
            ArchivoMP3 archivo2 = new ArchivoMP3("D:\\GRADO SUPERIOR\\Programacion\\Unidad02\\Mora Ft. Young Miko - TOA.mp3");
            ArchivoMP3 archivo3 = new ArchivoMP3("D:\\GRADO SUPERIOR\\Programacion\\Unidad02\\Mora Ft. De La Rose - AURORA.mp3");
            playlist1.añadir(archivo1);
            playlist1.añadir(archivo2);
            playlist1.añadir(archivo3);
            playlist1.guardar("D:\\GRADO SUPERIOR\\Programacion\\Unidad02\\Lista de Ejemplo");
            Reproductor reproductor1 = new Reproductor(archivo1, sincrono,info);
            Reproductor reproductor2 = new Reproductor(archivo2, sincrono,info);
            Reproductor reproductor3 = new Reproductor(archivo3, sincrono,info);
            reproductor1.play();
            reproductor2.play();
            reproductor3.play();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
