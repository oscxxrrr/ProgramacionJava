package interfaces.practica01;

public class Persona implements Nadador, Saltador{
    @Override
    public void nadar() {
        System.out.println("La persona esta nadando");
    }

    @Override
    public void sumergirse(int profundidad) {
        System.out.println("La persona se sumerge " + profundidad);
    }

    @Override
    public void saltar() {
        System.out.println("La persona esta saltando");
    }
}
