package Ej13contraseñas;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GeneradorContraseñasUnicas extends GeneradorConstraseñas {

    private Set<String> contraseñasGeneradas;

    public GeneradorContraseñasUnicas() {
        this(new Random());
    }

    public GeneradorContraseñasUnicas(Random r) {
        super(r);
        this.contraseñasGeneradas = new HashSet<>();
    }

    @Override
    public String generarContraseña(int longitud) {
        String contra;

        do {
            contra = super.generarContraseña(longitud);
        } while (this.contraseñasGeneradas.contains(contra));

        contraseñasGeneradas.add(contra);
        return contra;
    }

    @Override
    public String generarContraseña() {
        return this.generarContraseña(12);
    }
}