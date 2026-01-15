package Ejercicios;
import bpc.daw.objetos.MarcadorBaloncesto;
import bpc.daw.objetos.MarcadorBaloncesto.*;
public class Ejercicio12 {
        public static void main(String[] args){

            MarcadorBaloncesto marcador1 = new MarcadorBaloncesto("Estudiantes", "CB Granada");

            boolean c1 = marcador1.anotarCanasta('L', 2);
            boolean c2 = marcador1.anotarCanasta('V', 3);
            boolean c3 = marcador1.anotarCanasta('L', 2);
            boolean c4 = marcador1.anotarCanasta('V', 2);
            boolean c5 = marcador1.anotarCanasta('V', 3);
            boolean c6 = marcador1.anotarCanasta('L', 1);
            boolean c7 = marcador1.anotarCanasta('L', 1);
            boolean c8 = marcador1.anotarCanasta('v', 2);

            String nombreLocal = marcador1.getNombreLocal();
            java.lang.String nombreVisitante = marcador1.getNombreVisitante();
            int puntosLocal = marcador1.getPuntosLocal();
            int puntosVisitante = marcador1.getPuntosVisitante();
            String ganador = marcador1.getNombreEquipoGanador();
            String perdedor = marcador1.getNombreEquipoPerdedor();

            System.out.println("Equipo local: " + nombreLocal + "\nEquipo visitante: " + nombreVisitante + "\nPuntos equipo local: " + puntosLocal + "\nPuntos equipo visitante: " + puntosVisitante + "\nEquipo ganador: " + ganador + "\nEquipo perdedor: " + perdedor);

        }
}
