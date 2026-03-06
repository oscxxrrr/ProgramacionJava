package tema5.ej6punto;

import java.awt.*;

public class Punto {
    public int x;
    public int y;

    public Punto(){
        this(0,0);
    }

    public Punto(int x, int y){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int ancho = (int)dimension.getWidth();
        int alto = (int)dimension.getHeight();

        if (x<0 && x>ancho || y<0 && y>alto){
            this.x = x;
            this.y = y;
        }else {
            this.x = ancho;
            this.y = alto;
        }
    }

    public Punto(Punto p){
        this(p.x/2, p.y/2);
    }
}
