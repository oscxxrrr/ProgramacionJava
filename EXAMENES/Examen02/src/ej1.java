import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        File file = new File("index.html");
        try {
            Scanner scanner = new Scanner(file);
            String lineaEntera = scanner.nextLine();

            int inicio = lineaEntera.indexOf("<title>");
            int fin = lineaEntera.indexOf("</title>");
            String titulo = lineaEntera.substring(inicio + 7, fin);

            System.out.println("El titulo del html es: " + titulo);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
