package instanceoff;

public class Roedor extends Animal{
    public Roedor(String nombre, int precio) {
        super(nombre, precio);
    }
    public void roer(){
        System.out.println("El roedor " + this.getNombre() + " esta royendo");
    }
}
