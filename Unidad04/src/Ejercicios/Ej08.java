package Ejercicios;
import bpc.daw.objetos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        int numDep = 0;
        DepositoAgua deposito = null;
        List<DepositoAgua> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            DepositoAgua depositoAgua = new DepositoAgua(0,100);
            list.add(depositoAgua);
        }

        boolean repetir = true;
        while (repetir){
            System.out.println("""
                    Menu deposito de agua:
                        1) Dibujar deposito
                        2) Rellenar deposito
                        3) Vaciar deposito
                        4) Añadir deposito
                        5) Salir""");
            int opcion = new Scanner(System.in).nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce el numero de deposito que quieras dibujar: ");
                    numDep = new Scanner(System.in).nextInt();
                    deposito = list.get(numDep);
                    deposito.dibujar();
                    break;

                case 2:
                    System.out.println("Introduce el numero de deposito que quieras rellenar: ");
                    numDep = new Scanner(System.in).nextInt();
                    deposito = list.get(numDep);
                    System.out.println("Introduce la cantidad que quieras rellenarlo: ");
                    int rellenar = new Scanner(System.in).nextInt();
                    if (deposito.getCantidadActual() + rellenar < 100)
                    for (int i = 0; i < rellenar; i++) {
                        deposito.añadirLitro();
                    }
                    else if (deposito.getCantidadActual() + rellenar > 100) {
                        int numLlenar = (deposito.getCantidadActual() + rellenar) - 100;
                        for (int i = 0; i < numLlenar; i++) {
                            deposito.añadirLitro();
                        }
                        System.out.println("Se han añadido " + numLlenar + " litros.");
                    }else {
                        System.out.println("El deposito esta lleno ya. ");
                    }
                    break;

                case 3:
                    System.out.println("Introduce el numero de deposito que quieras vaciar: ");
                    numDep = new Scanner(System.in).nextInt();
                    deposito = list.get(numDep);

                    int cantidad = deposito.getCantidadActual();
                    for (int i = 0; i < cantidad; i++) {
                        deposito.retirarLitro();
                    }

                    System.out.println("Se han quitado " + cantidad + " litros.");
                    break;

                case 4:
                    DepositoAgua depositoAgua = new DepositoAgua(0,100);
                    list.add(depositoAgua);
                    int tamaño = list.size();
                    System.out.println("Se ha añadido un nuevo deposito en la posicion " + tamaño);
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    repetir = false;
                    break;

                default:
                    System.out.println("Introduce una opcion valida.");
            }
        }
    }
}
