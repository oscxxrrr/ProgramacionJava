package Ejercicios;

import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ej09 {
    public static void main(String[] args) {
        List<Rectangle> listRect = new ArrayList<>();
        List<Color> listColor = new ArrayList<>();
        Consola consola = new Consola();
        Teclado teclado = consola.getTeclado();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int alto = dimension.height;
        int margen = 0;

        //Almacenando 6 rectangulos
        for (int i = 0; i < 6; i++) {
            Rectangle rectangle = new Rectangle(250 + margen, alto/2 + 40, 100, 200);
            margen += 250;
            listRect.add(rectangle);
        }

        //Almacenando 6 colores
        for (int i = 0; i < 6; i++) {
            int r = new Random().nextInt(0,256);
            int g = new Random().nextInt(0,256);
            int b = new Random().nextInt(0,256);
            Color color = new Color(r,g,b);
            listColor.add(color);
        }

        //Imprimiendo rectangulos
        for (int i = 0; i < listRect.size(); i++) {
            graphics.setColor(listColor.get(i));
            Rectangle rectangle = listRect.get(i);
            graphics.fillRect((int)rectangle.getX(), (int)rectangle.getY(), rectangle.width, rectangle.height);
        }
        teclado.leerCaracter();
        capaCanvas.cls();

        //Cambiar los rectangulos de posicion
        for (int i = 0; i < listRect.size(); i++) {
            if (i%2==0){
                graphics.setColor(listColor.get(i + 1));
            }else {
                graphics.setColor(listColor.get(i - 1));
            }
            graphics.fillRect((int)listRect.get(i).getX(),(int)listRect.get(i).getY(),listRect.get(i).width, listRect.get(i).height);
        }

        teclado.leerCaracter();
    }
}
