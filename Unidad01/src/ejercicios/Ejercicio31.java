package ejercicios;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args){
        final int HORAS_LENGUAJEMARCAS = 128;
        final int HORAS_REDES = 192;
        final int HORAS_HARDWARE = 96;
        final int PORCENTAJE = 20;
        int faltasMaxRedes = 0;
        int faltasMaxLenguaje = 0;
        int faltasMaxHardware = 0;
        int faltasRedes = 0;


        faltasMaxLenguaje = HORAS_LENGUAJEMARCAS * PORCENTAJE /100;
        faltasMaxRedes = HORAS_REDES * PORCENTAJE /100;
        faltasMaxHardware = HORAS_HARDWARE * PORCENTAJE /100;

        System.out.println("Introduce el numero de faltas que tienes en redes: ");
        faltasRedes = new Scanner(System.in).nextInt();

        System.out.println("En lenguajes de marcas no puedes super la cantidad de "+ faltasMaxLenguaje+ " faltas\nEn redes no puedes super la cantidad de " + faltasMaxRedes+ " faltas\nEn hardware no puedes super la cantidad de "+ faltasMaxHardware+" faltas");

        String aprobado = faltasRedes>=faltasMaxRedes? "APROBADO":"SUSPENSO";



    }
}
