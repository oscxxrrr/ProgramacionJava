package tema5.Ej31EquipoMusica.test;

import org.junit.Test;
import tema5.Ej30altavoz.Altavoz;
import tema5.Ej31EquipoMusica.EquipoMusica;

import static org.junit.Assert.*;

public class EquipoMusicaTest {
    @Test
    public void test01(){
        EquipoMusica equipoMusica = new EquipoMusica(5);
        for (int i = 0; i < 5; i++) {
            System.out.println(equipoMusica.getAltavoz(i).getVolumen() );
        }
        System.out.println();
    }

    @Test
    public void test02(){
        EquipoMusica equipoMusica = new EquipoMusica(10);
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                equipoMusica.getAltavoz(i).ponerVolumen(Altavoz.VOL_MAX);
            }else {
                equipoMusica.getAltavoz(i).ponerVolumen(50);
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(equipoMusica.getAltavoz(i).getVolumen());
        }
    }
}