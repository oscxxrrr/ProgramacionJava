import jd.personajes.lib.Habitacion;

import java.time.Duration;
import java.time.LocalDateTime;

public record CintaVideo(LocalDateTime inicio, Duration duracion, Habitacion[] habitaciones) {
    public CintaVideo{
        if (inicio.isAfter(LocalDateTime.now())){
            throw new IllegalArgumentException("No puedes poner una fecha posterior a la actual");
        }
        if (habitaciones == null || habitaciones.length > 6){
            throw new IllegalArgumentException("El numero de habitaciones es incorrecto");
        }
    }
}
