package ejercicios;

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args){
        int cantidadDinero = 0;
        int billete500 = 0;
        int billete500resta = 0;
        int billete100 = 0;
        int billete100resta = 0;
        int billete50 = 0;
        int billete50resta = 0;
        int billete20 = 0;
        int billete20resta = 0;
        int billete10 = 0;
        int billete10resta = 0;
        int moneda2 = 0;
        int moneda2resta = 0;
        int moneda1 = 0;


        System.out.println("Introduce la cantidad de dinero: ");
        cantidadDinero = new Scanner(System.in).nextInt();

        billete500 = (cantidadDinero / 500);
        billete500resta = cantidadDinero - (billete500*500);

        cantidadDinero = billete500resta;

        billete100 = (cantidadDinero / 100);
        billete100resta = cantidadDinero - (billete100*100);

        cantidadDinero = billete100resta ;

        billete50 = (cantidadDinero / 50);
        billete50resta = cantidadDinero - (billete50*50);

        cantidadDinero = billete50resta ;

        billete20 = (cantidadDinero / 20);
        billete20resta = cantidadDinero - (billete20*20);

        cantidadDinero = billete20resta ;

        billete10 = (cantidadDinero / 10);
        billete10resta = cantidadDinero - (billete10*10);

        cantidadDinero = billete10resta ;

        moneda2 = (cantidadDinero / 2);
        moneda2resta = cantidadDinero - (moneda2*2);

        cantidadDinero = moneda2resta ;

        if(cantidadDinero == 1){
            moneda1 = 1;
        }

        System.out.println("Cantidad billetes de 500: "+billete500+"\n"+"Cantidad billetes de 100: "+billete100+"\n"+"Cantidad billetes de 50: "+billete50+"\n"+"Cantidad billetes de 20: "+billete20+"\n"+"Cantidad billetes de 10: "+billete10+"\nCantidad monedas 2: "+moneda2+"\n"+"Cantidad monedas 1: "+moneda1);
    }
}
