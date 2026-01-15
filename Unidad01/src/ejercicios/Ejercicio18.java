package ejercicios;

public class Ejercicio18 {
    public static void main(String[] args){

        final int PRECIO_HORA = 7;

        int sueldoMes = (PRECIO_HORA * 2) * 4;
        double tercerMes = 1.0 * 900 / 7;
        System.out.println("Dando 2/3 clases a la semana ganaria entre " + sueldoMes +"/"+(sueldoMes +(7*4)) + "€ al mes.\nPara ganar 900€ al mes deberia de hacer " + tercerMes + " clases a la semana.");
    }
}
