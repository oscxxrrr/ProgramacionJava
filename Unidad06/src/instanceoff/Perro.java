package instanceoff;

public class Perro extends Animal{
    public Perro(String nombre, int precio){
        super(nombre, precio);
    }
    public void ladrar(){
        System.out.println("El perro " + this.getNombre()+ " esta ladrando");
    }
}
