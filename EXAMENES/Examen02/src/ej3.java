import examen.misterio.*;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;

public class ej3 {
    public static void main(String[] args) {
        Mansion mansion = Mansion.getMasion();
        Personas persona1 = mansion.getPersonas();
        Personas persona2 = mansion.getPersonas();
        Personas persona3 = mansion.getPersonas();
        Personas persona4 = mansion.getPersonas();
        Personas persona5 = mansion.getPersonas();
        Personas persona6 = mansion.getPersonas();


        Sospechoso sospechoso1 = persona1.getSospechoso(1);
        Sospechoso sospechoso2 = persona2.getSospechoso(2);
        Sospechoso sospechoso3 = persona3.getSospechoso(3);
        Sospechoso sospechoso4 = persona4.getSospechoso(4);
        Sospechoso sospechoso5 = persona5.getSospechoso(5);
        Sospechoso sospechoso6 = persona6.getSospechoso(6);

        String pregunta1Sospechoso1 = sospechoso1.preguntar("¿Cómo te llamas?");
        String pregunta2Sospechoso1 = sospechoso1.preguntar("¿Qué relación tenías con Fulanito Perry?");
        String pregunta3Sospechoso1 = sospechoso1.preguntar("¿Dónde asesinaron a Fulanito Perry?");
        String pregunta4Sospechoso1 = sospechoso1.preguntar("¿A qué hora asesinaron a Fulanito Perry?");

        String pregunta1Sospechoso2 = sospechoso2.preguntar("¿Cómo te llamas?");
        String pregunta2Sospechoso2 = sospechoso2.preguntar("¿Qué relación tenías con Fulanito Perry?");
        String pregunta3Sospechoso2 = sospechoso2.preguntar("¿Dónde asesinaron a Fulanito Perry?");
        String pregunta4Sospechoso2 = sospechoso2.preguntar("¿A qué hora asesinaron a Fulanito Perry?");

        String pregunta1Sospechoso3 = sospechoso3.preguntar("¿Cómo te llamas?");
        String pregunta2Sospechoso3 = sospechoso3.preguntar("¿Qué relación tenías con Fulanito Perry?");
        String pregunta3Sospechoso3 = sospechoso3.preguntar("¿Dónde asesinaron a Fulanito Perry?");
        String pregunta4Sospechoso3 = sospechoso3.preguntar("¿A qué hora asesinaron a Fulanito Perry?");

        String pregunta1Sospechoso4 = sospechoso4.preguntar("¿Cómo te llamas?");
        String pregunta2Sospechoso4 = sospechoso4.preguntar("¿Qué relación tenías con Fulanito Perry?");
        String pregunta3Sospechoso4 = sospechoso4.preguntar("¿Dónde asesinaron a Fulanito Perry?");
        String pregunta4Sospechoso4 = sospechoso4.preguntar("¿A qué hora asesinaron a Fulanito Perry?");

        String pregunta1Sospechoso5 = sospechoso5.preguntar("¿Cómo te llamas?");
        String pregunta2Sospechoso5 = sospechoso5.preguntar("¿Qué relación tenías con Fulanito Perry?");
        String pregunta3Sospechoso5 = sospechoso5.preguntar("¿Dónde asesinaron a Fulanito Perry?");
        String pregunta4Sospechoso5 = sospechoso5.preguntar("¿A qué hora asesinaron a Fulanito Perry?");

        String pregunta1Sospechoso6 = sospechoso6.preguntar("¿Cómo te llamas?");
        String pregunta2Sospechoso6 = sospechoso6.preguntar("¿Qué relación tenías con Fulanito Perry?");
        String pregunta3Sospechoso6 = sospechoso6.preguntar("¿Dónde asesinaron a Fulanito Perry?");
        String pregunta4Sospechoso6 = sospechoso6.preguntar("¿A qué hora asesinaron a Fulanito Perry?");

        System.out.println("Sospechoso 1: \n" + pregunta1Sospechoso1 + "\n" + pregunta2Sospechoso1 + "\n"+ pregunta3Sospechoso1 + "\n"+ pregunta4Sospechoso1 + "\n");
        System.out.println("Sospechoso 2: \n" + pregunta1Sospechoso2 + "\n" + pregunta2Sospechoso2 + "\n"+ pregunta3Sospechoso2 + "\n"+ pregunta4Sospechoso2 + "\n");
        System.out.println("Sospechoso 3: \n" + pregunta1Sospechoso3 + "\n" + pregunta2Sospechoso3 + "\n"+ pregunta3Sospechoso3 + "\n"+ pregunta4Sospechoso3 + "\n");
        System.out.println("Sospechoso 4: \n" + pregunta1Sospechoso4 + "\n" + pregunta2Sospechoso4 + "\n"+ pregunta3Sospechoso4 + "\n"+ pregunta4Sospechoso4 + "\n");
        System.out.println("Sospechoso 5: \n" + pregunta1Sospechoso5 + "\n" + pregunta2Sospechoso5 + "\n"+ pregunta3Sospechoso5 + "\n"+ pregunta4Sospechoso5 + "\n");
        System.out.println("Sospechoso 6: \n" + pregunta1Sospechoso6 + "\n" + pregunta2Sospechoso6 + "\n"+ pregunta3Sospechoso6 + "\n"+ pregunta4Sospechoso6 + "\n");

        Habitacion biblioteca = mansion.getHabitacion(Habitaciones.BIBLIOTECA);
        Habitacion cocina = mansion.getHabitacion(Habitaciones.COCINA);
        Habitacion entrada = mansion.getHabitacion(Habitaciones.ENTRADA);
        Habitacion estudio = mansion.getHabitacion(Habitaciones.ESTUDIO);
        Habitacion jardin = mansion.getHabitacion(Habitaciones.JARDIN);
        Habitacion musical = mansion.getHabitacion(Habitaciones.SALA_MUSICAL);
        Habitacion recibidor = mansion.getHabitacion(Habitaciones.RECIBIDOR);
        Habitacion salon = mansion.getHabitacion(Habitaciones.SALON);
        Habitacion te = mansion.getHabitacion(Habitaciones.SALA_TE);
        Habitacion tv = mansion.getHabitacion(Habitaciones.SALA_TV);


        int almohada = Objetos.ALMOHADA;
        int armario = Objetos.ARMARIO;
        int baul = Objetos.BAUL;
        int bolsa = Objetos.BOLSA;
        int cintavideo = Objetos.CINTA_VIDEO;
        int cubo = Objetos.CUBO_BASURA;
        int llave = Objetos.LLAVE;
        int osoPeluche = Objetos.OSITO_PELUCHE;
        int ventana = Objetos.VENTANA;
        int arma = Objetos.PIEDRA;
        int arma2 = Objetos.TABLA;
        int reloj = Objetos.RELOJ;
        int diario = Objetos.PERIODICO;
        int horno = Objetos.HORNO;
        int planta = Objetos.PLANTA;

        biblioteca.mirar();
        cocina.mirar();
        entrada.mirar();
        estudio.mirar();
        jardin.mirar();
        musical.mirar();
        recibidor.mirar();
        salon.mirar();
        te.mirar();
        tv.mirar();

        Objeto musicaObj = musical.coger(osoPeluche);
        Objeto jardinObj = jardin.acercarse(cubo);
//        Objeto salonObj = salon.coger(diario);
        Objeto teObj = te.coger(osoPeluche);
        Objeto tvObj = tv.acercarse(baul);
        Objeto cocinaObj = cocina.acercarse(horno);
        Objeto biblioObj = biblioteca.acercarse(armario);


        String preguntaSos1 = sospechoso1.preguntarLugar(LocalDate.now(),LocalTime.now());
        String preguntaSos2 = sospechoso2.preguntarLugar(LocalDate.now(),LocalTime.now());
        String preguntaSos3 = sospechoso3.preguntarLugar(LocalDate.now(),LocalTime.now());
        String preguntaSos4 = sospechoso4.preguntarLugar(LocalDate.now(),LocalTime.now());
        String preguntaSos5 = sospechoso5.preguntarLugar(LocalDate.now(),LocalTime.now());
        String preguntaSos6 = sospechoso6.preguntarLugar(LocalDate.now(),LocalTime.now());

        System.out.println("Sospechoso 1: " + preguntaSos1 + "\nSospechoso 2: " + preguntaSos2 + "\nSospechoso 3: " + preguntaSos3 + "\nSospechoso 4: " + preguntaSos4+ "\nSospechoso 5: " + preguntaSos5+ "\nSospechoso 6: " + preguntaSos6);


    }
}
