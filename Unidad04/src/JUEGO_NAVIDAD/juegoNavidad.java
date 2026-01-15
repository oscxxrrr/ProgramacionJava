package JUEGO_NAVIDAD;

import bpc.daw.consola.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class juegoNavidad {
    public static void main(String[] args) {
        Consola consola = new Consola();
        CapaCanvas canvas = consola.getCapaCanvas();
        Graphics graphics = canvas.getGraphics();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        Teclado teclado = consola.getTeclado();
        int ancho = dimension.width;
        int altura = dimension.height;
        CapaSprites sprite = consola.getCapaSprites();

        //Rectangulo camara
        Rectangle camara = new Rectangle(0,0,ancho,altura);

        try {
            //Cargar imagenes
            BufferedImage bfJugador = ImageIO.read(new File("animacion.png"));
            BufferedImage bfFondo = ImageIO.read(new File("fondo1.jpg"));
            BufferedImage bfSkull = ImageIO.read(new File("skull.png"));

            Rectangle[][] rectanguloJugador = {
                    {
                            //DERECHA
                            new Rectangle(30,11,75,114),
                            new Rectangle(125,16,89,118),
                            new Rectangle(217,12,108,103)
                    },
                    {
                            //IZQUIERDA
                            new Rectangle(0,154,94,106),
                            new Rectangle(111,150,103,107),
                            new Rectangle(225,149,87,120)
                    }
            };
            //fila tabla rectangulos
            int direccion = 0;
            //columna tabla rectangulos
            int animacion = 0;
            //Creo jugador
            Sprite jugador = sprite.crearSprite(bfJugador,rectanguloJugador[direccion][animacion],50,700);

            int contadorAnimacion = 0;

            //GAME LOOP
            boolean repetir = true;
            while (repetir){
                //movemos jugador derecha
                if (teclado.teclaPulsada(KeyEvent.VK_RIGHT)){
                    if (jugador.getX()<ancho/2 || camara.x + ancho >= bfFondo.getWidth()){ //Cordenada del jugador esta en la mitad o cordenada de camara sumado al ancho de la pantalla es mayor o igual a la anchura del buffer fondo
                        if (jugador.getX() + jugador.getAnchura()<ancho){ // si coordenada de jugador sumada ala anchura del jugador es menor al ancho de la pantalla --> mueve el muñeco 5
                            jugador.moverX(5);
                        }else { // sino se para el juego
                            repetir = false;
                        }
                    }else { //si el jugador esta en medio se mueve la pantalla para la derecha tambien
                        camara.x+=5;
                    }
                    direccion = 0;
                    contadorAnimacion++;
                    if (contadorAnimacion == 10){
                        contadorAnimacion = 0;
                        animacion++;
                        if (animacion == rectanguloJugador[direccion].length){ //cuando animacion llegue a 3 pone animacion a 0 para reiniciar
                            animacion = 0;
                        }
                        jugador.setRectanguloFrame(rectanguloJugador[direccion][animacion]);
                    }

                }

                //jugador movimiento izquierda
                if (teclado.teclaPulsada(KeyEvent.VK_LEFT)){
                    if (jugador.getX()>ancho/2 || camara.x<=0){
                        if (jugador.getX()>=0){
                            jugador.moverX(-5);
                        }
                    }else {
                        camara.x-=5;
                    }
                    direccion = 1;
                    contadorAnimacion++;
                    if (contadorAnimacion == 10){
                        contadorAnimacion = 0;
                        animacion++;
                        if (animacion == rectanguloJugador[direccion].length){ //cuando animacion llegue a 3 pone animacion a 0 para reiniciar
                            animacion = 0;
                        }
                        jugador.setRectanguloFrame(rectanguloJugador[direccion][animacion]);
                    }

                }



                //dibujamos fondo
                graphics.drawImage(bfFondo,0,0,ancho,altura,camara.x,camara.y,camara.x + ancho, camara.y + altura, null);
                //Pulsar escape para salir
                if (teclado.teclaPulsada(KeyEvent.VK_ESCAPE)){
                    repetir = false;
                }

                //limitar bulce a 60 fps
                consola.esperarSiguienteFrame();

            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
