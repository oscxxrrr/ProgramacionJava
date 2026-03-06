package tema5.ej32Bingo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Bombo {

    private Queue<Bola> bolas;

    public Bombo(int totalBolas) {
        bolas = new ArrayDeque<>();
        Random random = new Random();

        for (int i = 0; i < totalBolas; i++) {
            int numero = random.nextInt(100) + 1;
            bolas.add(new Bola(numero));
        }
    }

    public int getNumeroBolas() {
        return bolas.size();
    }

    public Bola sacarBola() {
        return bolas.poll();
    }
}
