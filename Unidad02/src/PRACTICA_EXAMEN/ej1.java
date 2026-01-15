package PRACTICA_EXAMEN;


import bpc.daw.consola.*;

import java.awt.*;

public class ej1 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();

        texto.setColorTexto(Color.RED);
        texto.printct(15,"Bienvenido al ejercicio 1");

        teclado.setVisible(false);
        teclado.leerCaracter();

    }
}
