import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class juegotenis {
    public static void main(String[] args) {
        Consola consola = new Consola();

        CapaCanvas capaCanvas = consola.getCapaCanvas();
        Graphics graphics = capaCanvas.getGraphics();

        Teclado teclado = consola.getTeclado();
        teclado.setTipoCursor(Teclado.CURSOR_NULO);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int ancho = (int)dimension.getWidth();
        int alto = (int)dimension.getHeight();

        CapaSprites sprites = consola.getCapaSprites();

        //PUNTOS
        int puntosJugador2 = 0;
        int puntosJugador1 = 0;

        //Coger imagenes
        File file1 = new File("bola.png");
        File file2 = new File("pistaTenis.jpg");
        File file3 = new File("raqueta3B.png");
        try {
            //Velocidad raquetas
            int velocidadJugador1 = 5;
            int velocidadJugador2 = 5;

            //Velocidad de la pelota
            int pelotaX = 0;
            int pelotaY = 0;

            BufferedImage bfBola = ImageIO.read(file1);
            BufferedImage bfPista = ImageIO.read(file2);
            BufferedImage bfRaqueta = ImageIO.read(file3);

            //Creando sprite raqueta izquierda
            Sprite jugador1 = sprites.crearSprite(bfRaqueta,new Rectangle(0,0,80,191),120, alto/2);

            //Creando sprite raqueta derecha
            Sprite jugador2 = sprites.crearSprite(bfRaqueta,new Rectangle(0,0,80,191),ancho - 200, alto/2);

            //Creo sprite pelota
            Sprite pelota = sprites.crearSprite(bfBola,new Rectangle(0,0,60,60),ancho/2, alto/2);

            //GAME LOOP
            boolean resetPelota = true;
            boolean repetir = true;
            while (repetir){

                //Puslar escape para salir del juego
                if (teclado.teclaPulsada(KeyEvent.VK_ESCAPE)){
                    repetir = false;
                }

                if (resetPelota){
                    resetPelota = false;
                    pelota.setPosicion(ancho/2, alto/2);
                    do {
                        pelotaX = new Random().nextInt(-7,8);
                        pelotaY = new Random().nextInt(-7,8);
                    }while (pelotaX == 0 || pelotaY == 0);
                }
                graphics.drawString("Jugador 1: "+puntosJugador2,0,0);
                graphics.drawString("Jugador 2: "+puntosJugador1, 0,0);

                //Movimiento raqueta izquierda (w)arriba (s)abajo
                if (teclado.teclaPulsada(KeyEvent.VK_W) && jugador1.getY() > 0){ //Se mueve hacia arriba cuando la Y es mayor que 0, es decir que no supere por arriba la pantalla
                    jugador1.moverY(-velocidadJugador1);
                } else if (teclado.teclaPulsada(KeyEvent.VK_S) && jugador1.getY() + jugador1.getAltura() < alto){ //Se suma la Y con la altura para sacar el vertize de abajo a la izquierda y que no se pase de la altura, es decir que se pase por debajo de la pantalla.
                    jugador1.moverY(velocidadJugador1);
                }

                //Movimiento raqueta derecha (UP)arriba (DOWN)abajo
                if (teclado.teclaPulsada(KeyEvent.VK_UP) && jugador2.getY() > 0){
                    jugador2.moverY(-velocidadJugador2);
                } else if (teclado.teclaPulsada(KeyEvent.VK_DOWN) && jugador2.getY() + jugador2.getAltura() < alto){
                    jugador2.moverY(velocidadJugador2);
                }

                //Mover pelota
                pelota.moverY(pelotaY);
                pelota.moverX(pelotaX);

                //Cuando toque arriba o abajo rebota(cambiamos el signo a la y)
                if (pelota.getY() <= 0 || pelota.getY() + pelota.getAltura() >= alto){
                    pelotaY = -pelotaY;
                }

                //Rebote cuando la pelota la toque una raqueta
                if (jugador1.comprobarColision(pelota) || jugador2.comprobarColision(pelota)){
                    pelotaX = (pelotaX>0)? -(pelotaX+1):-(pelotaX - 1);
                }

                //Puntuacion
                if (pelota.getX() < 0){
                    puntosJugador2++;
                    resetPelota = true;
                } else if (pelota.getX() + pelota.getAnchura() > ancho) {
                    puntosJugador1++;
                    resetPelota = true;
                }

                //Dibujamos fondo
                graphics.drawImage(bfPista,0,0,ancho,alto,null);

                //Limitar velocidad del bucle a 60fps
                consola.esperarSiguienteFrame();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }




    }
}
