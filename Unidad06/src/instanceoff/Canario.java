package instanceoff;

public class Canario extends Animal{
    public Canario(String nombre, int precio){
        super(nombre, precio);
    }
    public void cantar(){
        System.out.println("El canario " + this.getNombre() +" esta cantando");
    }
}
