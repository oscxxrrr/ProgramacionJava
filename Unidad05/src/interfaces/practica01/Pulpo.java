package interfaces.practica01;

public class Pulpo implements Nadador{
    @Override
    public void nadar() {
        System.out.println("El puplo esta nadando");
    }

    @Override
    public void sumergirse(int profundidad) {
        System.out.println("El pulpo de sumerge " + profundidad);
    }

}
