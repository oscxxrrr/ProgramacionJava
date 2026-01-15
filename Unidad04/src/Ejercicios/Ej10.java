package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ej10 {
    public static void main(String[] args) {
        java.util.List<Rectangle> listRect = new ArrayList<>();
        Consola consola = new Consola();
        Teclado teclado = consola.getTeclado();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        CapaTexto texto = consola.getCapaTexto();
        int alto = dimension.height;
        int ancho = dimension.width;

        for (int i = 0; i < 20; i++) {
            Rectangle rectangle = new Rectangle(new Random().nextInt(0,ancho), new Random().nextInt(0,alto), 50,50);
            listRect.add(rectangle);
        }

        boolean repetir = true;
        while (repetir){
            texto.print(5,15,"""
                    Menu principal: 
                        1) Dibujar los rectangulos sin color
                        2) Dibujar los rectangulos de color rojo
                        3) Dibujar los rectangulos de color verde
                        4) Salir
                        
                        Elige una opcion:""");

            int opcion = teclado.leerNumeroEntero();
            texto.cls();


            switch (opcion){
                case 1:
                    capaCanvas.cls();
                    for (int i = 0; i < listRect.size(); i++) {
                        graphics.setColor(Color.WHITE);
                        Rectangle rectangle = listRect.get(i);
                        graphics.fillRect((int)rectangle.getX(), (int)rectangle.getY(), rectangle.width, rectangle.height);
                    }
                    break;

                case 2:
                    capaCanvas.cls();
                    for (int i = 0; i < listRect.size(); i++) {
                        Rectangle rectangle = listRect.get(i);
                        graphics.setColor(Color.RED);
                        graphics.fillRect((int)rectangle.getX(), (int)rectangle.getY(), rectangle.width, rectangle.height);
                    }
                    break;

                case 3:
                    capaCanvas.cls();
                    for (int i = 0; i < listRect.size(); i++) {
                        Rectangle rectangle = listRect.get(i);
                        graphics.setColor(Color.GREEN);
                        graphics.fillRect((int)rectangle.getX(), (int)rectangle.getY(), rectangle.width, rectangle.height);
                    }
                    break;

                case 4:
                    capaCanvas.cls();
                    texto.cls();
                    texto.printct(10,"Saliendo del programa...");
                    repetir = false;
                    break;

                default:
                    capaCanvas.cls();
                    texto.cls();
                    texto.printct(10,"Introduce una opcion valida");
                    break;
            }
        }
    }
}
