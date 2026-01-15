package Ejercicios;
import bpc.daw.consola.*;

import java.awt.*;

public class Ej25 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto capaTexto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        CapaFondo capaFondo = consola.getCapaFondo();
        FondoColorSolido fondoColorSolido = new FondoColorSolido(Color.WHITE);
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        capaFondo.setFondo(fondoColorSolido);
        capaTexto.setColorTexto(Color.BLACK);

        capaTexto.print("Introduzca el número de segundos: ");
        int sec=teclado.leerNumeroEntero();
        int cont = 0;

        graphics.setColor(Color.BLACK);
        graphics.drawRect(8,298,1504,44);

        graphics.setColor(Color.BLUE);
        for (int i=1;i<=sec;i++) {
            capaTexto.cls();
            cont= 100*i/sec;
            capaTexto.print(9,76,cont + "%");
            graphics.fillRect(10, 300, 1500/sec*i, 40);
            capaTexto.printct(15,"Esperando finalizacion ... ("+i+" seg de "+sec+")");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
