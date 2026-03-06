package tema5.Ej33notas;

import java.util.ArrayList;
import java.util.List;

public class Notas {
    private List<Double> notas;

    public Notas(){
        this.notas = new ArrayList<>();
    }

    public void añadirNota(double n){
        this.notas.add(n);
    }

    public int getTotalNotas(){
        return this.notas.size();
    }

    public double calcularNotaMedia(){

        double resultado = 0.0;
        double suma = 0.0;

        for (int i = 0; i < this.notas.size(); i++) {
            suma += this.notas.get(i);
        }

        return resultado = suma / this.notas.size();
    }

    public double calcularNotaMaxima(){

        if (this.notas.isEmpty()){
            throw new IllegalArgumentException("No hay notas añadidas.");
        }
        double num = 0;

        for (int i = 0; i < this.notas.size(); i++) {
            if (this.notas.get(i) > num){
                num = this.notas.get(i);
            }
        }
        return num;
    }
}
