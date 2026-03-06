package instanceoff;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        String opcion = "";
       do{
            System.out.println("""
                    Menu Principal:
                        1) Mostrar todos los animales:
                        2) Comprar un animal dada la posicion
                        3) Escuchar cantar a los canarios de la tienda
                        4) Salir
                    """);
            opcion = new Scanner(System.in).nextLine();
            switch (opcion){
                case "1" -> {
                    for (int i = 0; i < tienda.totalAnimales(); i++) {
                        System.out.println("Animal: " + tienda.getAnimal(i).getNombre() + "; " + tienda.getAnimal(i).getPrecio());
                    }
                }
                case "2"->{
                    System.out.println("Dime la posicion del anial: ");
                    int pos = new Scanner(System.in).nextInt();
                    tienda.vender(tienda.getAnimal(pos));
                }
                case "3"->{
                    for (int i = 0; i < tienda.totalAnimales(); i++) {
                        if (tienda.getAnimal(i) instanceof Canario canario){
                            canario.cantar();
                        }
                    }
                }
                case "4"->{
                    System.out.println("saliendo...");
                }
                default -> System.out.println("OPCION INCORRECTA");
            }
        }while (!opcion.equalsIgnoreCase("4"));
    }
}
