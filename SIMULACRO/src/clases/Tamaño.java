package clases;

import java.awt.*;

public enum Tamaño {
    PEQUEÑO, MEDIANO, GRANDE;

    public static Tamaño getTamaño(int alto, int ancho){
        Tamaño resultado = null;
        if (alto*ancho < 786432){
            resultado = Tamaño.PEQUEÑO;
        } else if (alto*ancho > 786432 && alto*ancho < 2073600){
            resultado = Tamaño.MEDIANO;
        }else {
            resultado = Tamaño.GRANDE;
        }
        return resultado;
    }
}
