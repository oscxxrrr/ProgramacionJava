package Simulacro01;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Simulacro06 {
    public static void main(String[] args) {

        try {
            Consola consola1 = new Consola();
            consola1.setTitulo("Simulacro 5");
            CapaTexto texto1 = consola1.getCapaTexto();

            File ruta = new File("Fuente.ttf");
            String texto = "Texto escrito con una fuente diferente a la predeterminada";
            Font fuente1 = Font.createFont(Font.TRUETYPE_FONT, ruta);
            texto1.setFont(fuente1);
            texto1.printct(15,texto);

            Teclado teclado = consola1.getTeclado();
            teclado.setVisible(false);
            teclado.leerCaracter();
        } catch (FontFormatException | IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
