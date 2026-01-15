package Simulacro01;
import bpc.daw.consola.*;

public class Simulacro02 {
    public static void main(String[] args) {
        try {
            Consola consola1 = new Consola();
            consola1.setTitulo("Simulacro2");
            CapaTexto capaTexto1 = consola1.getCapaTexto();
            capaTexto1.print(30,57,"Para salir pulse cualquier tecla");

            Teclado teclado1 = consola1.getTeclado();
            CapaFondo capaFondo1 = consola1.getCapaFondo();

            capaTexto1.print(10,20,"Introduce valor R: (Valores entre 0 y 255): ");
            int leerEnteroR = teclado1.leerNumeroEntero();
            capaTexto1.print(15,20,"Introduce valor G: (Valores entre 0 y 255): ");
            int leerEnteroG = teclado1.leerNumeroEntero();
            capaTexto1.print(20,20,"Introduce valor B: (Valores entre 0 y 255): ");
            int leerEnteroB = teclado1.leerNumeroEntero();

            FondoColorSolido fondo1 = new FondoColorSolido(leerEnteroR, leerEnteroG, leerEnteroB);
            capaFondo1.setFondo(fondo1);

            teclado1.setVisible(false);
            teclado1.leerCaracter();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
