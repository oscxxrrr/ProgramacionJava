package Ej22animales;

public class Jaula extends ContenedorAnimales{
    private int capacidadMaxima;
    private int pesoMaximo;

    public Jaula(int cm, int pm){
        this.capacidadMaxima = cm;
        this.pesoMaximo = pm;
    }

    public int getCapacidadMaxima(){
        return this.capacidadMaxima;
    }
    public int getPesoMaximo(){
        return this.pesoMaximo;
    }

    @Override
    protected boolean comprobarDisponibilidad(Animal a) {
        boolean resultado = false;
        int pesoDisp = this.pesoMaximo - super.getPesoActual();
        if (a.getPeso() <= pesoDisp && this.capacidadMaxima > super.getNumeroAnimales()){
            resultado = true;
        }
        return resultado;
    }

}
