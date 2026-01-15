package PRACTICA_EXAMEN;

import bpc.daw.consola.*;

public class ej2 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        CapaFondo fondo = consola.getCapaFondo();

        texto.printct(10,"Introduce el valor de R (0-255): ");
        int r = teclado.leerNumeroEntero();
        texto.printct(13,"Introduce el valor de G (0-255): ");
        int g = teclado.leerNumeroEntero();
        texto.printct(15,"Introduce el valor de B (0-255): ");
        int b = teclado.leerNumeroEntero();

        texto.cls();
        FondoColorSolido colorSolido = new FondoColorSolido(r,g,b);
        fondo.setFondo(colorSolido);


        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
