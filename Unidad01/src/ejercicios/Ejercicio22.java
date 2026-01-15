package ejercicios;

public class Ejercicio22 {
    public static void main(String[] args){
        double correctas = 22;
        double incorrectas = 6;
        double sinResponder = 2;
        double calculos_intermedios = correctas - (incorrectas / 3);
        double notaFinal = calculos_intermedios * 10 / 30;
        System.out.println("Correctas: "+correctas+ "\nIncorrectas: "+incorrectas+ "\nSin responder: "+sinResponder+"\nLa nota final es: "+notaFinal);
    }
}
