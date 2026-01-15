package ejercicios;
import java.lang.*;
import java.util.*;

public class Ejercicio10 {
    public static void main(String[] args){
         /*El viernes dia 26 de mayo tendrá lugar la reunión de
        evaluación del 1o curso de programación de aplicaciones web en el IES HLanz de Granada.
        Los profesores calificarán al alumnado y se prevé que a las 20:30 horas las
        notas estén publicadas en el tablón de anuncios del centro.*/

        System.out.println("Introduce la fecha de la reunion: ");
        String fecha = new Scanner(System.in).nextLine();
        System.out.println("Introduce el dia de la reunion: ");
        String diaReunion = new Scanner(System.in).nextLine();
        System.out.println("Introduce el mes de la reunion: ");
        String mes = new Scanner(System.in).nextLine();
        System.out.println("Introduce el curso de la reunion: ");
        int curso = new Scanner(System.in).nextInt();
        System.out.println("Introduce el grado de la reunion: ");
        String grado = new Scanner(System.in).nextLine();
        System.out.println("Introduce el instituto donde se hara la reunion: ");
        String instituto = new Scanner(System.in).nextLine();
        System.out.println("Introduce la localidad donde se hara la reunion: ");
        String localidad = new Scanner(System.in).nextLine();
        System.out.println("Introduce la hora donde se publicaram las notas: ");
        String horaNotasPubli = new Scanner(System.in).nextLine();

        System.out.println("El " + (fecha) + " " + " dia " + (diaReunion) + " de " + (mes) +" tendrá lugar la reunión de\n" +
                "evaluación del "+ (curso)+"º curso de " + (grado) + " en el " + (instituto) +" de "+ (localidad) +".\n" +
                "Los profesores calificarán al alumnado y se prevé que a las "+ (horaNotasPubli) + " horas las\n" +
                "notas estén publicadas en el tablón de anuncios del centro.");
    }
}
