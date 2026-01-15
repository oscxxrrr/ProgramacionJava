import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.List;

public class map2 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        Teclado teclado = consola.getTeclado();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        CapaTexto capaTexto = consola.getCapaTexto();

        Map<String, BufferedImage> personas = new HashMap<>();

        try {
            personas.put("oscar", ImageIO.read(new File("fondo.jpg")));
            personas.put("miguel", ImageIO.read(new File("fondo1.jpg")));

            capaTexto.printct(10, "Introduce un nombre para comprobar si esta en la agenda:");
            String nombre = teclado.leerCadenaCaracteres().toLowerCase();

            if (personas.containsKey(nombre)) {
                capaCanvas.cls();
                graphics.drawImage(personas.get(nombre), 50, 50, null);
            } else {
                capaTexto.cls();
                capaCanvas.cls();
                capaTexto.printct(15, "Este nombre no esta registrado.");
            }

        } catch (IOException e) {
            capaTexto.printct(15, "Error cargando las imagenes.");
        }
        teclado.leerCaracter();
    }
}
