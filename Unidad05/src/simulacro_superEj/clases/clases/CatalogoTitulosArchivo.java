package simulacro_superEj.clases.clases;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoTitulosArchivo implements CatologoTitulos {
    private String ruta;
    private List<Titulo> titulos;

    public CatalogoTitulosArchivo(String ruta) {
        this.ruta = ruta;
        this.titulos = new ArrayList<>();
        File fichero = new File(ruta);
        try {
            if(!fichero.exists()) {

                fichero.createNewFile();
            }else{
                FileReader fileReader = new FileReader(fichero);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linea = bufferedReader.readLine();
                while(linea!=null){
                    Titulo t = extraerTitulo(linea);
                    this.titulos.add(t);
                    linea = bufferedReader.readLine();
                }
                fileReader.close();
                bufferedReader.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Titulo> getTitulos() {
        return Collections.unmodifiableList(this.titulos);
    }

    @Override
    public boolean guardar() {
        boolean resultado = true;
        try (PrintWriter printWriter = new PrintWriter(this.ruta)){
            for(Titulo t: this.titulos){
                printWriter.println(t.toString());
            }
        } catch (FileNotFoundException e) {
            resultado=false;
            System.out.println("Error al guardar: "+e.getMessage());
        }
        return resultado;
    }



    @Override
    public List<Titulo> getTitulo() {
        return Collections.unmodifiableList(this.titulos);
    }

    static Titulo extraerTitulo(String linea){
        String[] datos = linea.split(";");
        Estado[] estados = Estado.values();
        return new TituloArchivo(datos[0], datos[1], datos[2], estados[Integer.parseInt(datos[3])]);
    }

    @Override
    public boolean añadirTitulos(String dni, String nombre, String estudio, Estado estado) {
        return this.titulos.add(new TituloArchivo(dni,nombre,estudio,estado));
    }
}
