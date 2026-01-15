package ejercicios;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args){
        int edad = 0;
        int genero = 0;
        double altura = 0;
        double peso = 0;
        int frequenciaCardiaca = 0;
        double masaCorporal = 0;
        String estado = " ";

        System.out.println("Dime tu edad: ");
        edad = new Scanner(System.in).nextInt();
        System.out.println("Dime tu genero: (hombre: 0 y mujer: 1)");
        genero = new Scanner(System.in).nextInt();
        System.out.println("Cuanto pesas: ");
        peso = new Scanner(System.in).nextDouble();
        System.out.println("Dime tu altura en metros: ");
        altura = new Scanner(System.in).nextDouble();

        if(genero == 0){
            frequenciaCardiaca = 220 - edad;
            masaCorporal = peso / (altura * altura);
            System.out.println("Tu frequencia cardiaca es: "+frequenciaCardiaca+"\nMasa corporal = "+masaCorporal);
        } else if (genero == 1) {
            frequenciaCardiaca = 226 - edad;
            masaCorporal = peso / (altura * altura);
            System.out.println("Tu frequencia cardiaca es: "+frequenciaCardiaca+"\nMasa corporal = "+masaCorporal);
        }

        if(masaCorporal <= 16.00){
            estado = "Infrapeso: delgadez severa";
        } else if (masaCorporal > 16.00 && masaCorporal <= 16.99) {
            estado = "Infrapeso: delgadez moderable";
        } else if (masaCorporal >= 17.00 && masaCorporal <= 18.49) {
            estado = "Infrapeso: delgadez aceptable";
        } else if (masaCorporal >= 18.50 && masaCorporal <= 24.99) {
            estado = "Peso normal";
        } else if (masaCorporal >= 25.00 && masaCorporal <= 29.99) {
            estado = "Sobrepeso";
        } else if (masaCorporal >= 30.00 && masaCorporal <= 34.99) {
            estado = "Sobrepeso tipo: I";
        } else if (masaCorporal >= 35.00 && masaCorporal <= 40.00) {
            estado = "Sobrepeso tipo: II";
        } else {
            estado = "Sobrepeso tipo: III";
        }
        System.out.println("IMC = " + estado);
    }
}
