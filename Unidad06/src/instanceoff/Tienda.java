package instanceoff;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<Animal> listaAnimales;

    public Tienda(){
        this.listaAnimales = new ArrayList<>();
        this.listaAnimales.add(new Perro("Max", 125));
        this.listaAnimales.add(new Perro("Pepe", 87));
        this.listaAnimales.add(new Canario("Julio", 216));
        this.listaAnimales.add(new Canario("Maike", 129));
        this.listaAnimales.add(new Canario("Juan", 127));
        this.listaAnimales.add(new Roedor("Dimas", 102));
        this.listaAnimales.add(new Roedor("Lock", 50));
        this.listaAnimales.add(new Roedor("Papiue", 559));
    }

    public Animal getAnimal(int pos){
        return this.listaAnimales.get(pos);
    }
    public int totalAnimales(){
        return this.listaAnimales.size();
    }
    public void vender(Animal a){
        System.out.println("El animal " + a.getNombre() + " se ha vendido. Con precio: " + a.getPrecio());
        this.listaAnimales.remove(a);
    }
}
