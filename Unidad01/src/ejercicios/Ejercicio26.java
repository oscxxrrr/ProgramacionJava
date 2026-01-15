package ejercicios;

import java.util.*;

public class Ejercicio26 {
    static public void main(String[] args){
        System.out.println("Introduce tu nota: ");
        int nota = new Scanner(System.in).nextInt();

        boolean aprobado = nota >= 5;
        boolean suspendido = nota < 5;

        System.out.println("Has aprobado ? "+ aprobado);
        System.out.println("Has suspendido ? "+ suspendido);
    }
}
