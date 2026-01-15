package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        boolean repetir = true;
        while (repetir){
            System.out.println("""
                    Menu principal:
                        1) Añadir mensajes:
                        2) Consultar tamaño:
                        3) Consultar mensaje:
                        4) Comprobar mensaje:
                        5) Consultar todos los mensajes:
                        6) Borrar todo:
                    """);
            int opcion = new Scanner(System.in).nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce un mensaje: ");
                    String mensaje = new Scanner(System.in).nextLine();
                    lista.add(mensaje);
                    break;

                case 2:
                    int tamaño = lista.size();
                    System.out.println("Numero de mensajes: "+(tamaño + 1));
                    break;
                case 3:
                    System.out.println("Introduce la posicion del mensaje que quieras consultar: ");
                    int posicion = new Scanner(System.in).nextInt();
                    
                    if (lista.isEmpty()){
                        System.out.println("LA LISTA ESTA VACIA");
                    } else if (posicion <= lista.size() && posicion >= 0) {
                        System.out.println(lista.get(posicion));
                    }else {
                        System.out.println("Introduce una posicion valida.");
                    }
                    break;
                case 4:
                    System.out.println("Introduce un mensaje para comporbar si esta en la lista: ");
                    String palabraContieneList = new Scanner(System.in).nextLine();

                    if (lista.contains(palabraContieneList)){
                        System.out.println("El mensaje esta en la lista y se encuentra en la posicion --> " + lista.indexOf(palabraContieneList) + 1);
                    }else {
                        System.out.println("No se encuentra en la lista");
                    }


//                    for (int i = 0; i < lista.size() && pararBucle; i++) {
//                        String comparar= lista.get(i);
//                        if (palabraContieneList.equalsIgnoreCase(comparar)){
//                            System.out.println("La palabra si esta en la lista, y se encuentra en la posicion --> " + i + 1);
//                            pararBucle = false;
//                        }else {
//                            System.out.println("No se encuentra en la lista");
//                        }
//                    }
                    break;
                case 5:
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(lista.get(i));
                    }
                    break;
                case 6:
                    lista.removeAll(lista);
                    break;
                default:
                    System.out.println("Introduce una opcion valida.");
                    break;


            }
        }

    }
}
