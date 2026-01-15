package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.awt.event.ItemListener;
import java.util.Random;

public class Ej48 {
    public static void main(String[] args) {
        final int PUNTOS = 0;
        final int NIVEL = 1;
        final int MOVIMIENTOS = 80;
        final int inicialX = 60;
        final int inicialY = 30;
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int anchura = (int)dimension.getWidth();
        int altura = (int)dimension.getHeight();
        Teclado teclado = consola.getTeclado();


        Random random = new Random();
        while (NIVEL!=5){

        String estado = "";
        texto.print(0,0,"NIVEL = " + NIVEL + "         PUNTOS = " + PUNTOS + "       MOVIMIENTOS RESTANTES = " + MOVIMIENTOS + "        ESTADO = " + estado + "\n------------------------------------------------------------------------------------------- ");
        texto.mostrarCuadricula(true);
        texto.print(40,15,"O");


        teclado.leerCaracter();
        }
    }
}
