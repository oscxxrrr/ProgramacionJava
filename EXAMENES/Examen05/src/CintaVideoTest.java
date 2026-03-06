import jd.personajes.lib.Habitacion;
import jd.personajes.lib.Mansion;
import jd.personajes.lib.NombreHabitacion;
import org.junit.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

import static org.junit.Assert.*;

public class CintaVideoTest {
    @Test ( expected = java.lang.IllegalArgumentException.class)
    public void test01()throws IllegalArgumentException{
        Mansion mansion = new Mansion();
        Habitacion hab1 = Mansion.getHabitacion(NombreHabitacion.BIBLIOTECA);
        Habitacion[] habitaciones = new Habitacion[1];
        habitaciones[0] = hab1;
        LocalDateTime inicio = LocalDateTime.of(2026,6,1,20,15,10);
        CintaVideo cintaVideo = new CintaVideo(inicio, Duration.ofMinutes(2), habitaciones);
        fail("No deberia de saltar este mensaje");
    }

}