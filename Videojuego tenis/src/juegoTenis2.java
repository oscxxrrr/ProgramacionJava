import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class juegoTenis2 {
    public static void main(String[] args) {
        Consola consola = new Consola();
        Teclado teclado = consola.getTeclado();
        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        int alto = (int) dimension.getHeight();
        int ancho = (int) dimension.getWidth();

        CapaSprites sprites = consola.getCapaSprites();

        try {
            teclado.setTipoCursor(Teclado.CURSOR_NULO);
            BufferedImage bfraqueta = ImageIO.read(new File("raqueta3B.png"));
            BufferedImage bfpelota = ImageIO.read(new File("bola.png"));
            BufferedImage bfpista = ImageIO.read(new File("pistaTenis.jpg"));

            Sprite jug1 = sprites.crearSprite(bfraqueta, new Rectangle(0, 0, 80, 191), 70, alto/2);
            Sprite jug2 = sprites.crearSprite(bfraqueta, new Rectangle(0, 0, 80, 191), ancho-150, alto/2);

            Sprite pelota = sprites.crearSprite(bfpelota, new Rectangle(0, 0, 60, 60), ancho/2, alto/2);


            //velocidad pelota
            int pelotaX = new Random().nextInt(-7,8);
            int pelotaY = new Random().nextInt(-7,8);

            //velocidad raquetas

            int velocidadJug1 = 5;
            int velocidadJug2 = 5;

            //puntos de los jugadores
            int puntos1 = 0;
            int puntos2 = 0;

            //Bucle juego
            boolean resetearPelota = true;
            boolean repetir = true;
            while (repetir){
                //Si pulsamos ESC se sale el juego.
                if (teclado.teclaPulsada(KeyEvent.VK_ESCAPE)){
                    repetir=false;
                }

                //dibujamos fondo
                graphics.drawImage(bfpista,0 ,0 , ancho, alto, null);

                //dibujamos marcador
                graphics.drawString("Jugador 1: "+puntos1,50,50);
                graphics.drawString("Jugador 2: "+ puntos2, ancho-250,50);

                if (resetearPelota){
                    resetearPelota = false;
                    pelota.setPosicion(ancho/2, alto/2);
                    do {
                        pelotaX = new Random().nextInt(-7,8);
                        pelotaY = new Random().nextInt(-7,8);
                    }while (pelotaX == 0 || pelotaY == 0);
                }

                //Asignamos teclas a raqueta 1
                if (teclado.teclaPulsada(KeyEvent.VK_W)&&jug1.getY()>0){
                    jug1.moverY(-velocidadJug1);
                }
                if (teclado.teclaPulsada(KeyEvent.VK_S)&&jug1.getY()+jug1.getAltura()<alto){
                    jug1.moverY(velocidadJug1);
                }

                //Asignamos teclas a raqueta 2
                if (teclado.teclaPulsada(KeyEvent.VK_UP)&&jug2.getY()>0){
                    jug2.moverY(-velocidadJug2);
                }
                if (teclado.teclaPulsada(KeyEvent.VK_DOWN)&&jug2.getY()+jug1.getAltura()<alto){
                    jug2.moverY(velocidadJug2);
                }

                //mover pelota
                pelota.moverY(pelotaY);
                pelota.moverX(pelotaX);


                //cuando toca arriba o abajo rebota
                if (pelota.getY()<=0||pelota.getY()+pelota.getAltura()>=alto){
                    pelotaY = -pelotaY;
                }

                //cuando toca la raqueta rebota
                if (jug1.comprobarColision(pelota)||jug2.comprobarColision(pelota)){
                    pelotaX = (pelotaX>0)? -(pelotaX+1):-(pelotaX - 1);
                }

                //Puntuacion
                if (pelota.getX() < 0){
                    puntos2++;
                    resetearPelota = true;
                } else if (pelota.getX() + pelota.getAnchura() > ancho) {
                    puntos2++;
                    resetearPelota = true;
                }

                //limitamos velocidad del bucle a 60fps
                consola.esperarSiguienteFrame();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
