import java.util.Scanner;

public class ej07 {
    public static void main(String[] args){
        final int GRANADA_JAEN = 90;
        final int TIEMPO_GRX_JAEN = 63;
        final int ALMUÑECAR_KM = 79;
        final int ALMERIA_KM = 156;
        final int MADRID_KM = 417;

        System.out.println("Elige el destino: \n 1) Almuñecar \n 2) Almeria \n 3) Madrid \n Elige la opcion poniendo 1,2 o 3:");
        int opcion = new Scanner(System.in).nextInt();

        if(opcion == 1){
            //Usare una regla de 3:
            double almuñecar = ALMUÑECAR_KM * 1.0 * TIEMPO_GRX_JAEN / GRANADA_JAEN;
            double horas = almuñecar / 60;
            double minutos = almuñecar % 60;
            horas = (int)horas;
            minutos = (int)minutos;
            String destino = "Almuñecar";
            System.out.println("El coche tardara " + horas + " hora/s y " + minutos + " en llegar a " + destino);


        } else if (opcion == 2) {
            double almeria = ALMERIA_KM * 1.0 * TIEMPO_GRX_JAEN / GRANADA_JAEN;
            double horas = almeria / 60;
            double minutos = almeria % 60;
            horas = (int)horas;
            minutos = (int)minutos;
            String destino = "Almeria";
            System.out.println("El coche tardara " + horas + " hora/s y " + minutos + " en llegar a " + destino);

        }else if (opcion == 3) {
            double madrid = MADRID_KM * 1.0 * TIEMPO_GRX_JAEN / GRANADA_JAEN;
            double horas = madrid / 60;
            double minutos = madrid % 60;
            horas = (int)horas;
            minutos = (int)minutos;
            String destino = "Madrid";
            System.out.println("El coche tardara " + horas + " hora/s y " + minutos + " en llegar a " + destino);

        }
        //Uso el 60 porque son los minutos que contiene 1h.
    }
}
