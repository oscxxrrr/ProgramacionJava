package practicar;

import java.util.*;

public class examen_corregido {
    public static void main(String[] args) {
        int[][] pepe = {
                {1,4,9,5},
                {2,7,3,2},
                {1,9,4,6},
                {3,2,1,3}
        };

        int[][] maikel = {
                {1,2,3,4},
                {4,1,2,3},
                {3,4,1,2},
                {2,3,4,1}
        };

        int[][] petronila = {
                {9, 2, 1, 3},
                {6, 3, 6, 3},
                {3, 5, 6, 1},
                {1 ,2 ,6 ,8}
        };
        Map<String, int[][]> agenda = new HashMap<>();
        agenda.put("pepe", pepe);
        agenda.put("maikel", maikel);
        agenda.put("petronila", petronila);


        System.out.println("Introduce tu nombre: ");
        String nombreIntroducido = new Scanner(System.in).nextLine();

        int filas = 0;
        int columnas = 0;
        boolean correcto = false;

        Set<String> nombresClaves = agenda.keySet();
        for (String i : nombresClaves) {
            if (nombreIntroducido.equalsIgnoreCase(i)){
                filas = new Random().nextInt(0,4);
                columnas = new Random().nextInt(0,4);
                System.out.println("Introduce el numero que se encuentra en la fila: " + (filas+1) + " columna: " + (columnas + 1));
                int num = new Scanner(System.in).nextInt();

                int[][] adivinar = agenda.get(nombreIntroducido);
                for (int j = 0; j < adivinar.length; j++) {
                    if (adivinar[filas][columnas] == num){
                        correcto = true;
                    }else {
                        correcto = false;
                    }
                }

            }
        }
        if (!correcto){
            System.out.println("acceso denegado " + nombreIntroducido);
        }else {
            System.out.println("acceso permitido " + nombreIntroducido);
        }
    }
}
