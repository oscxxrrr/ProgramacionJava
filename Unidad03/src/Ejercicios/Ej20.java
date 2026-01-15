package Ejercicios;

import bpc.daw.consola.*;

public class Ej20 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaTexto texto = consola.getCapaTexto();

        int y = 0;

        for (int i = 1; i <= 20; i++) {
            if (i%2==1){
                texto.print(y,0,i + ") En clase no se juega");
                y++;
            } else{
                texto.print(y,65,i + ") En clase no se juega");
                y++;
            }
        }
        Teclado teclado = consola.getTeclado();
        teclado.setVisible(false);
        teclado.leerCaracter();
    }
}
