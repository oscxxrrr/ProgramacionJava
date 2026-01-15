package Ejercicios;

import bpc.daw.consola.*;

public class Ej21 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();

        int y = 0;
        int y2 = 0;

        for (int i = 1; i <= 20; i++) {
            if (i>=1&&i<=10){
                texto.print(y,0,i + ") En clase no se juega");
                y = y + 1;
            }else{
                texto.print(y2,65,i + ") En clase no se juega");
                y2 = y2 + 1;
            }
        }

        Teclado teclado = consola.getTeclado();
        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
