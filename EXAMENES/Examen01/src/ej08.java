import java.util.Scanner;

public class ej08 {
    public static void main(String[] args){

        System.out.println("Introduce el primer numero:");
        double a = new Scanner(System.in).nextInt();
        System.out.println("Introduce el primer numero:");
        double b = new Scanner(System.in).nextInt();

        double division = a / b;

        if(b == 0){
            System.out.println("No se puede dividir entre 0");
        } else if ( b != 0) {
            System.out.println("¿Quieres sacar decimales? (1 = si, 2 = no)");
            int opcion = new Scanner(System.in).nextInt();

            if(opcion == 1){
                System.out.println("El resultado enseñando decimales es: " + division);
            } else if (opcion == 2) {
                double cociente = a / b;
                double resto = a % b;
                cociente = (int)cociente;
                resto = (int)resto;
                System.out.println("El cociente es: " + cociente +"\n El resto es: " + resto);
            }else {
                System.out.println("opcion incorrecta");
            }
        }
        System.out.println("\nFin del programa");
    }
}
