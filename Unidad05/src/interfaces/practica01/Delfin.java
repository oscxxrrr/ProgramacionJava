package interfaces.practica01;

public class Delfin implements Nadador, Saltador{
    @Override
    public void nadar() {
        System.out.println("El delfin esta nadando");
    }

    @Override
    public void sumergirse(int profundidad) {
        System.out.println("El delfin se sumerge " + profundidad);
    }

    @Override
    public void saltar() {
        System.out.println("El delfin esta saltando");
    }
}
