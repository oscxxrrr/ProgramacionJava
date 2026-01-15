package Simulacro01;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

import java.awt.*;

public class Simulacro01 {
    public static void main(String[] args) {
        Consola consola1 = new Consola();
        consola1.setTitulo("Simulacro1");
        CapaTexto capaTexto1 = consola1.getCapaTexto();
        capaTexto1.setColorTexto(Color.RED);
        capaTexto1.print(15,30,"Bienvenidos al instituto");

        try {
            Thread.sleep(2000000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


    }
}
