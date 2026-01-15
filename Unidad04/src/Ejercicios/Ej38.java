package Ejercicios;

import java.util.*;

public class Ej38 {
    public static void main(String[] args) {
        List<String> nomPelis = new ArrayList<>();
        Map<String,String> socios = new HashMap<>();
        boolean repetir = true;
        while (repetir){
            System.out.println("""
                    Menu prinicipal:
                        1) añadir pelicula
                        2) añadir socio
                        3) prestar pelicula
                        4) devolver pelicula
                        5) salir
                        
                    """);
            String opcion = new Scanner(System.in).nextLine();
            switch (opcion){
                case "1" -> {
                    System.out.println("NUEVA PELICULA");
                    System.out.println("Introduce el nombre de la pelicula: ");
                    String titulo = new Scanner(System.in).nextLine();
                    nomPelis.add(titulo);
                }
                case "2" -> {
                    System.out.println("NUEVO SOCIO");
                    System.out.println("Introduce tu nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    socios.put(nombre,null);
                }
                case "3" -> {
                    System.out.println("ALQUILER PELICULA");
                    System.out.println("Dime tu nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    if (socios.get(nombre)!=null){
                        System.out.println("Este socio ya tiene una pelicula alquilada");
                    }else {
                        System.out.println("PELICULAS DISPONIBLES: \n" + nomPelis);
                        System.out.println("Introduce la pelicula que quieras escoger: ");
                        String peli = new Scanner(System.in).nextLine();
                        if (!nomPelis.contains(peli)){
                            System.out.println("PELICULA NO DISPONIBLE");
                        }else {
                            socios.put(nombre,peli);
                            nomPelis.remove(peli);
                        }
                    }
                }
                case "4" -> {
                    System.out.println("Introduce tu nombre: ");
                    String nombreSocio = new Scanner(System.in).nextLine();
                    if (socios.get(nombreSocio) == null){
                        System.out.println("Ese socio no tiene ninguna pelicula alquilada.");
                    }else {
                        String peli = socios.get(nombreSocio);
                        nomPelis.add(peli);
                        socios.put(nombreSocio, null);
                    }
                }
                case "5" -> {
                    repetir = false;
                    System.out.println("Saliendo ...");
                }
                default -> System.out.println("Introduce una opcion valida");
            }


        }
    }
}
