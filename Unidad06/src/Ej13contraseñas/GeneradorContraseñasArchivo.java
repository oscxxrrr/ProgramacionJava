package Ej13contraseñas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class GeneradorContraseñasArchivo extends GeneradorConstraseñas {

    private File archivo;

    public GeneradorContraseñasArchivo(String ruta) {
        this(ruta, new Random());
    }

    public GeneradorContraseñasArchivo(String ruta, Random r) {
        super(r);
        this.archivo = new File(ruta);
    }

    @Override
    public String generarContraseña(int longitud) {
        String contraseña = super.generarContraseña(longitud);

        try {
            FileWriter fileWriter = new FileWriter(this.archivo, true);
            fileWriter.write(contraseña + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        return contraseña;
    }
}