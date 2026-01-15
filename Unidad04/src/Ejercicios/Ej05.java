package Ejercicios;

import bpc.daw.mario.Mario;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ej05 {
    public static void main(String[] args) {
        List<String> listaMarios = new ArrayList<>();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int ancho = dimension.width;
        int alto = dimension.height;
        for (int i = 0; i <10 ; i++) {
            Mario mario = new Mario(new Random().nextInt(0,ancho), alto/2);
            if (mario.getX()%2==0){
                mario.andarHacia(0,0);
            }else {
                mario.andarHacia(1024,0);
            }
        }
    }
}
