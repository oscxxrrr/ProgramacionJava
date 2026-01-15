package Ejercicios;

public class Ej18 {
    public static void main(String[] args) {
        String[] alumnos = {"Pepe","Ana","Juan","Roberta"};
        int[] programacion = {9,4,2,10};
        int[] basedatos = {5,8,5,10};
        int[] sistemas = {4,6,10,10};
        int[] ipe = {3,5,2,9};

        for (int i = 0; i < programacion.length; i++) {
            String nombre = alumnos[i];
            int notaProgramacion = programacion[i];
            int notaBasedatos = basedatos[i];
            int notaSistemas = sistemas[i];
            int notaIpe = ipe[i];
            double media = (notaIpe + notaSistemas + notaBasedatos + notaProgramacion)/4.0;
            System.out.println("Nombre: " + nombre + "\nNota media: " + media + "\n");
        }
    }
}
