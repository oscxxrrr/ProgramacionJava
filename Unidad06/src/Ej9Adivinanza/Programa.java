package Ej9Adivinanza;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Adivinanza adivinanza = new Adivinanza("como me llamo", "oscar");
        System.out.println(adivinanza.getEnunciado());
        System.out.println("Introduce la respuesta: ");
        String res = new Scanner(System.in).nextLine();
        try {
            adivinanza.comprobar(res);
        } catch (TiempoSuperadoException | AdivinanzaIncorrectaException e) {
            throw new RuntimeException(e);
        }
    }
}
