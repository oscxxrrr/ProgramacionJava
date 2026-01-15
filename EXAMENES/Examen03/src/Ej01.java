import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;
import bpc.daw.consola.Teclado;
import com.jd.diana;
import java.awt.*;

public class Ej01 {
    public static void main(String[] args) {
        int cont = 0;
        Consola consola = new Consola();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        CapaTexto texto = consola.getCapaTexto();
        Teclado teclado = consola.getTeclado();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        Graphics graphics = capaCanvas.getGraphics();
        int alto = dimension.height;
        int ancho = dimension.width;
        int puntos = 0;
        boolean dejarDisparar = true;
        boolean repetir = true;
         while (repetir){
             texto.cls();
             texto.printct(15,"Introuce un numero de disparos par y mayor de 4: ");
             int disparos = teclado.leerNumeroEntero();

             if (disparos%2==0 && disparos >= 4){
                 texto.cls();
                 Diana diana = new Diana(ancho/2,alto/2,500);
                 diana.dibujar(graphics);
                 for (int i = 1; i <= disparos && dejarDisparar; i++) {
                     if (i <= disparos/2){
                         Dardo dardo = new Dardo(15,Color.RED);
                         ResultadoDisparo resultado = diana.disparar(dardo);
                         diana.dibujar(graphics);
                         double distancia = resultado.getDistancia();
                         if (distancia == 0){
                             puntos = puntos + 1000;
                         } else if (distancia >= 1 && distancia <= 100) {
                             puntos = puntos + 500;
                         } else if (distancia >= 101 && distancia <= 300) {
                             puntos = puntos + 200;
                         }else if (distancia >= 301 && distancia <= 400) {
                             puntos = puntos + 100;
                         } else if (resultado.getColor() == dardo.getColor()) {
                             puntos = puntos + 400;
                         }
                         if (!resultado.estaDentro()){
                            cont++;
                         }
                     }else {
                         Dardo dardo = new Dardo(15,Color.WHITE);
                         ResultadoDisparo resultado = diana.disparar(dardo);
                         diana.dibujar(graphics.create(120,30,1500,1500));
                         double distancia = resultado.getDistancia();
                         if (distancia == 0){
                             puntos = puntos + 1000;
                         } else if (distancia >= 1 && distancia <= 100) {
                             puntos = puntos + 500;
                         } else if (distancia >= 101 && distancia <= 300) {
                             puntos = puntos + 200;
                         }else if (distancia >= 301 && distancia <= 400) {
                             puntos = puntos + 100;
                         } else if (resultado.getColor() == dardo.getColor()) {
                             puntos = puntos + 400;
                         }
                         if (!resultado.estaDentro()){
                             cont++;
                         }

                         if (i == 4){
                             if (puntos < 500 || cont>=4){
                                dejarDisparar = false;
                                repetir = false;
                                texto.println("Eres muy malo");
                             }
                         }
                     }

                     try {
                         Thread.sleep(1000);
                     } catch (InterruptedException e) {
                         System.out.println(e.getMessage());
                     }
                 }
                 texto.cls();
                 texto.print(2,10,"Tu puntuacion total es de: " + puntos);
                 repetir = false;
             }
        }
         teclado.leerCaracter();
    }
}
