package tema5.Ej40depositoAguaInmutable;

public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima) {
    public DepositoAguaInmutable {
        if (capacidadActual < 0 || capacidadMaxima < 0 || capacidadActual > capacidadMaxima) {
            throw new IllegalArgumentException("Capacidad actual o maxima incorrecta");
        }
    }
    public DepositoAguaInmutable(int capacidadMaxima){
        this(0,capacidadMaxima);
    }

    public DepositoAguaInmutable añadirLitro(){
        return new DepositoAguaInmutable(this.capacidadActual + 1, capacidadMaxima);
    }
    public DepositoAguaInmutable retirarLitro(){
        return new DepositoAguaInmutable(this.capacidadActual - 1, capacidadMaxima);
    }

    public int getPorcentaje() {
        return (int) ((double) this.capacidadActual / this.capacidadMaxima * 100);
    }

}
