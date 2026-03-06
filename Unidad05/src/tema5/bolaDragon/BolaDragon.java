package tema5.bolaDragon;

import tema5.ej32Bingo.Bombo;

public class BolaDragon {
    private static final int MAXIMO_BOLAS = 7;
    private static int siguienteBola = 1;
    private int número;

    public BolaDragon(int número){
        this.número = número;
    }

    public int getNúmero() {
        return this.número;
    }

    public static BolaDragon crearBolaDragon(){
        if (BolaDragon.siguienteBola > 7){
            throw new IllegalArgumentException("Ya se han creado 7 bolas");
        }
        return new BolaDragon(BolaDragon.siguienteBola++);
    }

    public void reset(){
        BolaDragon.siguienteBola = 1;
    }
}
