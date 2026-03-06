package com.Cocina;

import java.util.Objects;

public class Vitroceramica {
    private Recipiente[][] fuegos;
    private boolean[][] fuegosEncendidos;

    private Vitroceramica(int filas, int columnas){
        if (filas >= 0 || columnas >= 0){
            throw new IllegalArgumentException("Filas o columnas incorrectas");
        }
        this.fuegos = new Recipiente[filas][columnas];
        this.fuegosEncendidos = new boolean[filas][columnas];
    }

    public void ponerRecipiento(Recipiente r, int f, int c){

        if (!(f > 0 && f < this.fuegos.length && c > 0 && c < this.fuegos[0].length)){
            throw new IllegalArgumentException("Numero de filas o columnas es incorrecto");




        }
        this.fuegos[f][c] = r;
    }
}
