import java.util.Scanner;

public class ej05 {
    public static void main(String[] args){
        int alturaPozo = 0;
        int metrosDiarios = 0;
        double diasTarda = 0;

        System.out.println("Introduce la altura del pozo:");
        alturaPozo = new Scanner(System.in).nextInt();
        System.out.println("Introduce los metros diarios que cae la rana:");
        metrosDiarios = new Scanner(System.in).nextInt();

        if(metrosDiarios < 0 || metrosDiarios > 3){
            System.out.println("La rana no puede caer mas de 3 metros al dia");
        }else {
            diasTarda = alturaPozo / metrosDiarios;
            System.out.println("Teniendo en cuenta que la altura del pozo es = " + alturaPozo + " y que la rana cae " + metrosDiarios + " diarios, tardara un total de " + diasTarda + " dias.");
            if(diasTarda >= 7){
                System.out.println("La rana moriria ya que tiene que estar 7 o mas dias sobreviviendo.");
            }
        }
    }
}
