package ejercicios;

public class Ejercicio09 {
    public static void main(String[] args){
         /*El viernes dia 26 de mayo tendrá lugar la reunión de
        evaluación del 1o curso de programación de aplicaciones web en el IES HLanz de Granada.
        Los profesores calificarán al alumnado y se prevé que a las 20:30 horas las
        notas estén publicadas en el tablón de anuncios del centro.*/

        String fecha = "Lunes";
        String diaReunion = "20";
        String mes = "junio";
        byte curso = 1;
        String grado = "ESO";
        String instituto = "IES HLanz";
        String localidad = "Granada";
        String horaNotasPubli = "13:45";

        System.out.println("El " + (fecha) + " " + " dia " + (diaReunion) + " de " + (mes) +" tendrá lugar la reunión de\n" +
                "evaluación del "+ (curso)+"º de " + (grado) + " en el " + (instituto) +"de "+ (localidad) +".\n" +
                "Los profesores calificarán al alumnado y se prevé que a las "+ (horaNotasPubli) + " horas las\n" +
                "notas estén publicadas en el tablón de anuncios del centro.");
    }
}
