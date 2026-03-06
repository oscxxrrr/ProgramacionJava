package Ej22animales;

public class TransporteAnimales extends Jaula{

    public TransporteAnimales() {
        super(6, 500);
    }

    @Override
    protected boolean comprobarDisponibilidad(Animal a) {
        int pesoDisp = this.getPesoMaximo() - super.getPesoActual();

        if (a.getPeso() > pesoDisp || this.getCapacidadMaxima() <= super.getNumeroAnimales()){
            return false;
        }

        if (super.animales.isEmpty()){
            return true;
        }

        for (Animal anim : super.animales) {
            if (!anim.getClass().equals(a.getClass())) {
                return false;
            }
        }
        return true;
    }
    @Override
    public boolean añadir(Animal a){
        a.setEncerrado(true);
        boolean resultado = false;
        if (comprobarDisponibilidad(a)){
            resultado = true;
            this.animales.add(a);
        }
        return resultado;
    }
}