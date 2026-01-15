import java.util.Scanner;

public class ej06 {
    public static void main(String[] args){
        int edad = 0;
        int antiguedad = 0;

        System.out.println("Introduce tu edad: ");
        edad = new Scanner(System.in).nextInt();
        System.out.println("Introduce tu antiguedad del carnet de conducir: ");
        antiguedad = new Scanner(System.in).nextInt();


        if(edad >= 21 && edad < 25 && antiguedad >= 2){
            System.out.println("Puede alquilar el coche pero tienes un recargo.");
        } else if (edad >= 25 && antiguedad >= 2) {
            System.out.println("Puedes alquilar el coche.");
        } else if (edad < 21 || antiguedad < 2) {
            System.out.println("No tienes la edad o la antiguedad suficiente");
        }
    }
}
