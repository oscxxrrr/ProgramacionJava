package Ejercicios;

import bpc.daw.objetos.MarcadorMejorado;

public class Ejercicio48 {
    public static void main(String[] args) {
        MarcadorMejorado marcador = new MarcadorMejorado("Estudiantes", "CB Granada");
        marcador.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.NORMAL);
        marcador.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.TRIPLE);
        marcador.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.NORMAL);
        marcador.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.NORMAL);
        marcador.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.TRIPLE);
        marcador.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.TIRO_LIBRE);
        marcador.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.TIRO_LIBRE);
        marcador.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.NORMAL);

        System.out.println("(local)" + marcador.getNombreLocal() + " " + marcador.getPuntosLocal() +" - "+ marcador.getPuntosVisitante() + " " + marcador.getNombreVisitante() + "(visitante)" +  "\nEquipo ganador: " + marcador.getNombreEquipoGanador() + "\nEquipo perdedor: " + marcador.getNombreEquipoPerdedor());
    }
}
