package ejercicios;

public class Ejercicio33 {
    public static void main(String[] args){
        final int NUM_ALUMNOS = 26;
        final double PORCENTAJE_APROBADOS = 66;
        final double PORCENTAJE_SUSPENDIDOS = 19.5;

        double sin_presentarse = 100 - PORCENTAJE_APROBADOS + PORCENTAJE_SUSPENDIDOS;
        int num_aprobados = NUM_ALUMNOS * (int)PORCENTAJE_APROBADOS / 100;
        int num_suspendidos = NUM_ALUMNOS * (int)PORCENTAJE_SUSPENDIDOS / 100;
        int num_sinPresentarse = NUM_ALUMNOS * (int)sin_presentarse / 100;

        System.out.println("Aprobados: "+num_aprobados+"\nSuspendidos: "+ num_suspendidos+"\nSin presentarse: "+num_sinPresentarse);

    }
}
