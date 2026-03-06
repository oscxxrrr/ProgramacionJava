package Ej13contraseñas;

import java.util.Random;

public class GeneradorConstraseñas {
    private Random random;

    public GeneradorConstraseñas() {
        this(new Random());
    }

    public GeneradorConstraseñas(Random r) {
        this.random = r;
    }

    public String generarContraseña(int longitud) {
        StringBuilder respuesta = new StringBuilder();
        int ascii  = 0;
        for (int i = 0; i < longitud; i++) {
            int tipo = this.random.nextInt(3);

            if (tipo == 0) {
                ascii = this.random.nextInt(48, 58);
            } else if (tipo == 1) {
                ascii = this.random.nextInt(65, 91);
            } else {
                ascii = this.random.nextInt(97, 123);
            }
            respuesta.append((char) ascii);
        }
        return respuesta.toString();
    }

    public String generarContraseña() {
        return this.generarContraseña(8);
    }
}