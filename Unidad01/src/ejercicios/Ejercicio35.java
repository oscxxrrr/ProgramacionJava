package ejercicios;

public class Ejercicio35 {
    public static void main(String[] args){
        final double INGRESO_1 = 15000;
        final double INGRESO_2 = 16000;
        final double INGRESO_3 = 10000;
        final double INGRESO_4 = 9000;
        final double INGRESO_5 = 12000;
        final double INGRESO_6 = 13000;
        final double INGRESO_7 = 7000;
        final double INGRESO_8 = 6000;
        final double INGRESO_9 = 11000;
        final double INGRESO_10 = 13000;
        final double INGRESO_11 = 14000;
        final double INGRESO_12 = 15000;

        final double PERDIDA_1 = 8000;
        final double PERDIDA_2 = 9000;
        final double PERDIDA_3 = 11000;
        final double PERDIDA_4 = 10000;
        final double PERDIDA_5 = 12000;
        final double PERDIDA_6 = 10000;
        final double PERDIDA_7 = 9000;
        final double PERDIDA_8 = 8000;
        final double PERDIDA_9 = 9000;
        final double PERDIDA_10 = 9000;
        final double PERDIDA_11 = 12000;
        final double PERDIDA_12 = 14000;
        boolean enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre, balanceAnual;
        double mediaIngresos, mediaGastos;
        enero = INGRESO_1 >= PERDIDA_1;
        febrero = INGRESO_2 >= PERDIDA_2;
        marzo = INGRESO_3 >= PERDIDA_3;
        abril = INGRESO_4 >= PERDIDA_4;
        mayo = INGRESO_5 >= PERDIDA_5;
        junio = INGRESO_6 >= PERDIDA_6;
        julio = INGRESO_7 >= PERDIDA_7;
        agosto = INGRESO_8 >= PERDIDA_8;
        septiembre = INGRESO_9 >= PERDIDA_9;
        octubre = INGRESO_10 >= PERDIDA_10;
        noviembre = INGRESO_11 >= PERDIDA_11;
        diciembre = INGRESO_12 >= PERDIDA_12;

        if(enero == true){
            System.out.println("Enero tiene un balance positivo");
        }else {
            System.out.println("Enero tiene un balance negativo");
        }

        if(febrero == true){
            System.out.println("Febrero tiene un balance positivo");
        }else {
            System.out.println("Febrero tiene un balance negativo");
        }

        if(marzo == true){
            System.out.println("Marzo tiene un balance positivo");
        }else {
            System.out.println("Marzo tiene un balance negativo");
        }

        if(abril == true){
            System.out.println("Abril tiene un balance positivo");
        }else {
            System.out.println("Abril tiene un balance negativo");
        }

        if(mayo == true){
            System.out.println("Mayo tiene un balance positivo");
        }else {
            System.out.println("Abril tiene un balance negativo");
        }

        if(junio == true){
            System.out.println("Junio tiene un balance positivo");
        }else {
            System.out.println("Mayo tiene un balance negativo");
        }

        if(julio == true){
            System.out.println("Julio tiene un balance positivo");
        }else {
            System.out.println("Junio tiene un balance negativo");
        }

        if(agosto == true){
            System.out.println("Agosto tiene un balance positivo");
        }else {
            System.out.println("Julio tiene un balance negativo");
        }

        if(septiembre == true){
            System.out.println("Septiembre tiene un balance positivo");
        }else {
            System.out.println("Agosto tiene un balance negativo");
        }

        if(octubre == true){
            System.out.println("Octubre tiene un balance positivo");
        }else {
            System.out.println("Septiembre tiene un balance negativo");
        }

        if(noviembre == true){
            System.out.println("Noviembre tiene un balance positivo");
        }else {
            System.out.println("Octubre tiene un balance negativo");
        }

        if(diciembre == true){
            System.out.println("Diciembre tiene un balance positivo");
        }else {
            System.out.println("Noviembre tiene un balance negativo");
        }
        mediaIngresos = INGRESO_1 + INGRESO_2 + INGRESO_3 + INGRESO_4 + INGRESO_5 + INGRESO_6 + INGRESO_7 + INGRESO_8 + INGRESO_9 + INGRESO_10 + INGRESO_11 + INGRESO_12/ 12;
        mediaGastos = PERDIDA_1 + PERDIDA_2 + PERDIDA_3 + PERDIDA_4 + PERDIDA_5 + PERDIDA_6 + PERDIDA_7 + PERDIDA_8 + PERDIDA_9 + PERDIDA_10 + PERDIDA_11 + PERDIDA_12 / 12;

        System.out.println("La media de ingresos es: " +mediaIngresos+ "\nLa media de gastos es: " + mediaGastos);

        balanceAnual = mediaIngresos >= mediaGastos;

        if(balanceAnual == true){
            System.out.println("El balance anual es positivo");
        } else if (balanceAnual == false) {
            System.out.println("El balance anual es negativo");
        }else{
            System.out.println("El balance de ingresos y gastos es igual.");
        }
    }
}
