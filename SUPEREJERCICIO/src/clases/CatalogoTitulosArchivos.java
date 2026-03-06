package clases;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoTitulosArchivos implements CatalogoTitulos{
    private String ruta;
    private List<Titulo> titulos;

    CatalogoTitulosArchivos(String ruta){
        File file = new File(ruta);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linea = bufferedReader.readLine();
                while (linea!=null){
                    Titulo t = extraerTitulo(linea);
                    this.titulos.add(t);
                    linea = bufferedReader.readLine();
                }
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.ruta = ruta;
        this.titulos = new ArrayList<>();
    }
    static Titulo extraerTitulo(String linea){
        String[] datos = linea.split(";");
        Estado[] estados = Estado.values();
        return new TituloArchivo(datos[0], datos[1], datos[2], estados[Integer.parseInt(datos[3])]);
    }

    @Override
    public List<Titulo> getTitulos() {
        return Collections.unmodifiableList(this.titulos);
    }

    @Override
    public boolean guardar() {
        boolean resultado;
        try {
            PrintWriter pr = new PrintWriter(this.ruta);
            for (int i = 0; i < this.titulos.size(); i++) {
                pr.println(this.titulos.get(i).toString());
            }
            pr.close();
            resultado = true;
        } catch (FileNotFoundException e) {
            resultado = false;
            throw new RuntimeException(e);
        }
        return  resultado;
    }

    @Override
    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado) {
        return this.titulos.add(new TituloArchivo(dni,nombre,estudio,estado));
    }
}
