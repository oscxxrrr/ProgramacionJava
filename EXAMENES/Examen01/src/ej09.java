import java.util.Scanner;

public class ej09 {
    public static void main(String[] args){
        System.out.println("Introduce tu numero: ");
        double num = new Scanner(System.in).nextInt();

        double dig1 = num / 1000;
        double dig2 = (num / 100);
        double dig3 = num / 10;
        double dig4 = num % 10;
        dig1 = (int)dig1;
        System.out.println(dig1);
        System.out.println(dig2);
        System.out.println(dig3);
        System.out.println(dig4);

    }
}
