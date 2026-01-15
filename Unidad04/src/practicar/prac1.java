package practicar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        List<String> mensajes = new ArrayList<>();
        boolean repetir = true;
        while (repetir){
            System.out.println("Elige una opción:\n" +
                    "   \t1. Añadir mensaje\n" +
                    "   \t2. Consultar tamaño\n" +
                    "   \t3. Consultar mensaje\n" +
                    "   \t4. Comprobar mensaje\n" +
                    "   \t5. Consultar todos los mensajes\n" +
                    "   \t6. Borrar todo\n" +
                    "   \t7. Salir");
            System.out.println("Elige una opcion: ");
            int opcion = new Scanner(System.in).nextInt();
            if (opcion == 1){
                System.out.println("Introduce el mensaje que quieras introducir: ");
                String palabra = new Scanner(System.in).nextLine();
                mensajes.add(palabra);
            } else if (opcion == 2) {
                System.out.println("La lista tiene un tamaño de: " + mensajes.size());
            } else if (opcion == 3) {
                if (mensajes.isEmpty()){
                    System.out.println("La lista esta vacia.");
                }else {
                    System.out.println("Introduce el numero de la posicion: ");
                    int pos = new Scanner(System.in).nextInt();
                    if (pos > mensajes.size()){
                        System.out.println("No esta esa posicion");
                    }else {
                        System.out.println("El mensaje de la posicion: " + pos + " es = " + mensajes.get(pos));
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Introduce el mensaje para ver la posicion y coprobar que esta en la lista: ");
                String palabra = new Scanner(System.in).nextLine();
                if (mensajes.contains(palabra)){
                    System.out.println("La palabra: " + palabra + " si esta, y se encuentra en la posicion: " + mensajes.indexOf(palabra));
                }else {
                    System.out.println("La palabra: " + palabra + " no se encuentra en la lista.");
                }
            } else if (opcion == 5) {
                System.out.println("La lista: " + mensajes);
            } else if (opcion == 6) {
                mensajes.clear();
                System.out.println("Limpiando toda la lista...");
            } else if (opcion == 7) {
                System.out.println("Saliendo...");
                repetir = false;
            }else {
                System.out.println("Introduce una opcion valida.");
            }
        }
    }
}
