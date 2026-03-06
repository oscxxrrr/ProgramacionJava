package simulacro_superEj.clases.clases;

import org.junit.Test;

import static org.junit.Assert.*;

public class CatalogoTitulosArchivoTest {
    @Test
    public void test1(){
        CatalogoTitulosArchivo c = new CatalogoTitulosArchivo("test1.txt");
        Titulo t = c.extraerTitulo("12345678M;Pepe López;Explotación de Sistemas Informáticos;1");
        assertEquals("12345678M",t.getDNI());
        assertEquals("Pepe López",t.getNombre());
        assertEquals("Explotación de Sistemas Informáticos",t.getEstudios());
        assertEquals(1,t.getEstado().ordinal());
    }
    @Test
    public void test2(){
        CatalogoTitulosArchivo c = new CatalogoTitulosArchivo("archivo1.txt");
        assertTrue(c.añadirTitulos("11111111H","Luis López","Carrocería",Estado.RECOGIDO));
        assertTrue(c.añadirTitulos("22222222W","María López","Desarrollo de aplicaciones web",Estado.SIN_RECIBIR));
        assertTrue(c.añadirTitulos("33333333M","John López","Electricidad",Estado.RECIBIDO));
        assertTrue(c.guardar());
    }
    @Test
    public void test3(){
        CatalogoTitulosArchivo c = new CatalogoTitulosArchivo("archivo1.txt");
        assertEquals(3,c.getTitulos().size());
        assertEquals("11111111H",c.getTitulos().get(0).getDNI());
    }


}