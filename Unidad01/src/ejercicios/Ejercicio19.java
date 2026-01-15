package ejercicios;

public class Ejercicio19 {
    public static void main(String[] args){

        final int SUELDO_ESTUDIANTE = 200;
        final int COMPLEMENTO_ALUMNO = 15;
        final int GANANCIAS_ACADEMIA = 100;
        int alumnos = 30;
        int complementoTotal = COMPLEMENTO_ALUMNO*30;
        int estudianteSueldo = SUELDO_ESTUDIANTE + complementoTotal;
        int ganaciasAcademia = (GANANCIAS_ACADEMIA - 15) * alumnos; //Le resto 15 porque es lo que le paga al estudiante.

        System.out.println("El estudiante cobrara " + estudianteSueldo + "€ al mes.");
        System.out.println("La academia ganara " + ganaciasAcademia + "€ al mes.");
    }
}
