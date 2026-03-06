package clases;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ListaFotos implements ColeccionFotos{
    private List<Foto> fotos;

    public ListaFotos(ArrayList<Foto> fotos) {
        this.fotos = fotos;
    }

    public ListaFotos() {
        this.fotos = new ArrayList<>();
    }

    public boolean añadir(String rutaArchivo) {
        try {
            BufferedImage bf = ImageIO.read(new File(rutaArchivo + ".jpg"));
            return this.fotos.add(new Foto(rutaArchivo, bf));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int getNumeroFotos() {
        return this.fotos.size();
    }

    @Override
    public boolean existeFoto(String nombre) {
        for (Foto f : fotos) {
            if (f.nombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Foto getFoto(String nombre) {
        for (Foto f : fotos) {
            if (f.nombre().equalsIgnoreCase(nombre)) {
                return f;
            }
        }
        throw new NoSuchElementException("LA FOTO NO ESTA EN LA COLECCION");
    }


    @Override
    public boolean borrarFoto(String nombre) {
        boolean resultado = false;
        for (int i = 0; i < this.fotos.size(); i++) {
            if (this.fotos.get(i).nombre().equalsIgnoreCase(nombre)){
                resultado = true;
                this.fotos.remove(i);
            }else {
                resultado = false;
            }
        }
        return resultado;
    }

    @Override
    public List<Foto> getFotos(Tamaño tamaño) {
        List<Foto> fotos = new ArrayList<>();
        for (int i = 0; i < this.fotos.size(); i++) {
            if (this.fotos.get(i).tamaño().equals(tamaño)){
                fotos.add(this.fotos.get(i));
            }
        }
        return fotos;
    }
}
