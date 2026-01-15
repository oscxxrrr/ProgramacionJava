import java.util.Scanner;

public class ej04 {
    public static void main(String[] args){
        int radio = 0;
        double volumen = 0;

        System.out.println("Introdce el radio de la esfera:");
        radio = new Scanner(System.in).nextInt();

        if(radio <= 0){
            System.out.println("El radio tiene que ser mayor que 0");
        }else{
            volumen = 4/3 * 3.141559 * (radio * radio * radio);
            System.out.println("El volumen es: " + volumen);
        }


    }
}
