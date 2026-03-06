package instanceoff;

public class Animal {
    private String nombre;
    private int precio;
    public Animal(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }

}
