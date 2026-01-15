package practicar;

import java.util.Random;
import java.util.Scanner;

public class prac2 {

    public static void main(String[] args) {
        String[][] tablaMinas = new String[10][10];
        for (int i = 0; i < tablaMinas.length; i++) {
            for (int j = 0; j < tablaMinas[i].length; j++) {
                tablaMinas[i][j] = "agua";
            }
        }
        System.out.println("Bienvenido al juego de buscaminas !!");
        System.out.println("====================================");
        boolean repetir = true;
        while (repetir){
            System.out.println("""
                    Introduce el nivel que quieras jugar:
                        1) Primer nivel (3 minas)
                        2) Segundo nivel (5 minas)
                        3) Tercer nivel (7 minas)
                        4) Salir
                    """);
            int opcion = new Scanner(System.in).nextInt();
            int vidas = 5;
            if (opcion == 1){
                System.out.println("NIVEL 1");
                System.out.println("=======");

                for (int i = 0; i < 3; i++) {
                    int fila = new Random().nextInt(0,10);
                    int columna = new Random().nextInt(0,10);
                    tablaMinas[fila][columna] = "mina";
                }

                for (int i = 0; i < tablaMinas.length; i++) {
                    for (int j = 0; j < tablaMinas[i].length; j++) {
                        System.out.print(" " + tablaMinas[i][j] + " ");
                    }
                    System.out.println();
                }

                while (vidas!=0){
                    System.out.println("Te quedan " + vidas + " vidas.");
                    System.out.println("Introduce columna que quieras desbloquear: ");
                    int columnaCliente = new Scanner(System.in).nextInt();
                    System.out.println("Introduce fila que quieras desbloquear: ");
                    int filaCliente = new Scanner(System.in).nextInt();

                    if (tablaMinas[filaCliente][columnaCliente].equalsIgnoreCase("mina")){
                        System.out.println("BOOOOM");
                        vidas--;
                    }else {
                        System.out.println("SALVADO");
                    }
                }
                System.out.println("Te has quedado sin vidas.");

            } else if (opcion == 2) {
                System.out.println("NIVEL 2");
                System.out.println("=======");

                for (int i = 0; i < 5; i++) {
                    int fila = new Random().nextInt(0,10);
                    int columna = new Random().nextInt(0,10);
                    tablaMinas[fila][columna] = "mina";
                }

                for (int i = 0; i < tablaMinas.length; i++) {
                    for (int j = 0; j < tablaMinas[i].length; j++) {
                        System.out.print(" " + tablaMinas[i][j] + " ");
                    }
                    System.out.println();
                }

                while (vidas!=0){
                    System.out.println("Te quedan " + vidas + " vidas.");
                    System.out.println("Introduce columna que quieras desbloquear: ");
                    int columnaCliente = new Scanner(System.in).nextInt();
                    System.out.println("Introduce fila que quieras desbloquear: ");
                    int filaCliente = new Scanner(System.in).nextInt();

                    if (tablaMinas[filaCliente][columnaCliente].equalsIgnoreCase("mina")){
                        System.out.println("BOOOOM");
                        vidas--;
                    }else {
                        System.out.println("SALVADO");
                    }
                }
                System.out.println("Te has quedado sin vidas.");

            } else if (opcion == 3) {
                System.out.println("NIVEL 3");
                System.out.println("=======");

                for (int i = 0; i < 7; i++) {
                    int fila = new Random().nextInt(0,10);
                    int columna = new Random().nextInt(0,10);
                    tablaMinas[fila][columna] = "mina";
                }

                for (int i = 0; i < tablaMinas.length; i++) {
                    for (int j = 0; j < tablaMinas[i].length; j++) {
                        System.out.print(" " + tablaMinas[i][j] + " ");
                    }
                    System.out.println();
                }

                while (vidas!=0){
                    System.out.println("Te quedan " + vidas + " vidas.");
                    System.out.println("Introduce columna que quieras desbloquear: ");
                    int columnaCliente = new Scanner(System.in).nextInt();
                    System.out.println("Introduce fila que quieras desbloquear: ");
                    int filaCliente = new Scanner(System.in).nextInt();

                    if (tablaMinas[filaCliente][columnaCliente].equalsIgnoreCase("mina")){
                        System.out.println("BOOOOM");
                        vidas--;
                    }else {
                        System.out.println("SALVADO");
                    }
                }
                System.out.println("Te has quedado sin vidas.");
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
                repetir = false;
            }else {
                System.out.println("Introduce una opcion valida.");
            }
        }
    }
}
