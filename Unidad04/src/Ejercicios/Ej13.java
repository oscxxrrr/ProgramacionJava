package Ejercicios;

import java.util.*;

public class Ej13 {
    public static void main(String[] args) {
        List<Integer> listaNum = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listaNum.add(new Random().nextInt(0,101));
        }
        System.out.println(listaNum);
        Collections.sort(listaNum);
        System.out.println(listaNum);
    }
}
