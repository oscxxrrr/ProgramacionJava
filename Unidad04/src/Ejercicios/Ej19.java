package Ejercicios;

public class Ej19 {
    public static void main(String[] args) {
        int[] ingresos = {15000,16000,10000,9000,10000,12000,13000,7000,6000,11000,13000,14000,15000};
        int[] gastos = {8000,9000,11000,10000,12000,10000,9000,8000,9000,9000,12000,14000};
        String[] mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int sumaIngresos = 0;
        int sumaGastos = 0;
        for (int i = 0; i < ingresos.length - 1; i++) {
            int ingresoMes = ingresos[i];
            int gastoMes = gastos[i];
            int comprobacion = ingresoMes - gastoMes;
            if (comprobacion < 0){
                System.out.println(mes[i] + " = estas tiene un balance negativo. \n");
            }else {
                System.out.println(mes[i] + " = estas tiene un balance positivo --> " + comprobacion +"€\n");
            }
            sumaIngresos = sumaIngresos + ingresoMes;
            sumaGastos = sumaGastos + gastoMes;
        }
        System.out.println("Hay una media de gastos de: " + sumaGastos/12+"€");
        System.out.println("Hay una media de ingresos de: " + sumaIngresos/12+"€");
        if (sumaIngresos > sumaGastos){
            System.out.println("El balance anual es positivo.");
        }else {
            System.out.println("El balance anual es negativo.");
        }
    }
}
