package ejercicios;

public class Ejercicio08 {
    public static void main(String[] args){
        /*El viernes dia 26 de mayo tendrá lugar la reunión de
        evaluación del 1o curso de programación de aplicaciones web en el IES HLanz de Granada.
        Los profesores calificarán al alumnado y se prevé que a las 20:30 horas las
        notas estén publicadas en el tablón de anuncios del centro.*/

        String fecha = "Viernes";
        String diaReunion = "26";
        String mes = "mayo";
        byte curso = 1;
        String grado = "Programacion de aplicaciones web";
        String instituto = "IES HLanz";
        String localidad = "Granada";
        String horaNotasPubli = "20:30";

        System.out.println("El " + (fecha) + " " + " dia " + (diaReunion) + " de " + (mes) +" tendrá lugar la reunión de\n" +
                "evaluación del "+ (curso)+"º curso de " + (grado) + " en el " + (instituto) +"de "+ (localidad) +".\n" +
                "Los profesores calificarán al alumnado y se prevé que a las "+ (horaNotasPubli) + " horas las\n" +
                "notas estén publicadas en el tablón de anuncios del centro.");
    }
}
