import java.lang.*;
import java.util.*;

public class Ejemplo4 {
    public static void main(String[] args){
        System.out.println("Como te llamas?: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Hola, " + nombre);
    }
}
