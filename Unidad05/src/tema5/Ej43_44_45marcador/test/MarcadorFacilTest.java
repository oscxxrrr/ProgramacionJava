package tema5.Ej43_44_45marcador.test;

import org.junit.Test;
import tema5.Ej43_44_45marcador.MarcadorFacil;
import tema5.Ej43_44_45marcador.TipoCanasta;
import tema5.Ej43_44_45marcador.TipoEquipo;

import static org.junit.Assert.*;

public class MarcadorFacilTest {
    @Test
    public void test01(){
        MarcadorFacil marcadorFacil = new MarcadorFacil("Granada", "Estudiantes");
        //LOCAL
        for (int i = 0; i < 5; i++) {
            marcadorFacil.añadirCanasta(TipoEquipo.LOCAL, TipoCanasta.TIRO_LIBRE);
        }
        for (int j = 0; j < 8; j++) {
            marcadorFacil.añadirCanasta(TipoEquipo.LOCAL, TipoCanasta.CANASTA_NORMAL);
        }
        for (int j = 0; j < 4; j++) {
            marcadorFacil.añadirCanasta(TipoEquipo.LOCAL, TipoCanasta.TRIPLE);
        }

        //VISITANTE
        for (int i = 0; i < 3; i++) {
            marcadorFacil.añadirCanasta(TipoEquipo.VISITANTE, TipoCanasta.TIRO_LIBRE);
        }
        for (int i = 0; i < 10; i++) {
            marcadorFacil.añadirCanasta(TipoEquipo.VISITANTE, TipoCanasta.CANASTA_NORMAL);
        }
        for (int i = 0; i < 1; i++) {
            marcadorFacil.añadirCanasta(TipoEquipo.VISITANTE, TipoCanasta.TRIPLE);
        }

        assertEquals(33, marcadorFacil.getPuntos(TipoEquipo.LOCAL));
        assertEquals(26, marcadorFacil.getPuntos(TipoEquipo.VISITANTE));


    }

    @Test
    public void test02(){
        MarcadorFacil marcadorFacil = new MarcadorFacil("Granada", "Estudiantes");
        for (int i = 0; i < 100; i++) {
            marcadorFacil.añadirCanasta(TipoEquipo.LOCAL, TipoCanasta.TIRO_LIBRE);
            if (i < 80){
                marcadorFacil.añadirCanasta(TipoEquipo.VISITANTE, TipoCanasta.TIRO_LIBRE);
            }
        }
        assertEquals(100, marcadorFacil.getPuntos(TipoEquipo.LOCAL));
        assertEquals(80, marcadorFacil.getPuntos(TipoEquipo.VISITANTE));

        System.out.println(marcadorFacil.getMarcador());
    }

}