package Ejercicios;

import bpc.daw.consola.*;

public class Ej31 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        Teclado teclado = consola.getTeclado();
        CapaTexto texto = consola.getCapaTexto();

        texto.printct(15,"Introduce la cantidad de segundos para hacer una cuenta atras: ");
        int segundos = teclado.leerNumeroEntero();

        for (int i = segundos; i >= 1; i--) {
            texto.cls();
            texto.setTamTexto(180);
            texto.printct(1, "" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
