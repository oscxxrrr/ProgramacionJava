package interfaces.practica01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        System.out.println("""
                Elige un personaje: 
                    1) Perosona
                    2) Delfin
                    3) Pulpo
                """);
        int opcion = new Scanner(System.in).nextInt();

        Nadador nadador = switch (opcion){
            case 1 -> new Persona();
            case 2 -> new Delfin();
            case 3 -> new Pulpo();
            default -> throw new IllegalArgumentException("Personaje incorrecto");
        };
        nadador.nadar();

        Saltador[] saltador = {new Persona(), new Persona(), new Delfin(), new Delfin()};
        for (Saltador s : saltador) {
            s.saltar();
        }
    }
}
