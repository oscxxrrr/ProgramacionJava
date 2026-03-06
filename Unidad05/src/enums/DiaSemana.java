package enums;

public enum DiaSemana {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    public boolean esFinde(){
        return this.ordinal() >= 5;
    }

}
