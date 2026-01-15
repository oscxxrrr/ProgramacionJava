package Ejercicios;

import java.beans.XMLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ej37 {
    public static void main(String[] args) {
        Map<String, Integer> personas = new HashMap<>();
        personas.put("Oscar", 611003373);
        personas.put("Adrian", 600304158);
        personas.put("Alvaro", 678554326);

        boolean repetir = true;
        while (repetir){
            System.out.println("""
                    Menu principal:
                        1) añadir entrada
                        2) consultar telefono
                        3) mostrar listado
                        4) salir
                    """);
            int opcion = new Scanner(System.in).nextInt();
            if (opcion == 1){
                System.out.println("Introduce un nombre: ");
                String nombre = new Scanner(System.in).nextLine();
                System.out.println("Introduce un numero de telefono: ");
                int numeroTelefono = new Scanner(System.in).nextInt();
                personas.put(nombre,numeroTelefono);
            } else if (opcion == 2) {
                System.out.println("Introduce el nombre que quieras saber su numero de telefono: ");
                String nombre = new Scanner(System.in).nextLine();
                if (personas.get(nombre)!=null){
                    System.out.println("El numero de telefono de " + nombre + " es: " + personas.get(nombre));
                }else {
                    System.out.println("Introduce un nombre que este en la lista.");
                }
            } else if (opcion == 3) {
                Set<String> claves = personas.keySet();
                for (String nom : claves){
                    int num = personas.get(nom);
                    System.out.println("Nombre: " + nom + " Telf: " + num + "\n");
                }
                System.out.println(personas);
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
                repetir = false;
            }else {
                System.out.println("Introduce una opcion valida");
            }
        }
    }
}
