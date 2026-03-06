package tema5.ej5oficina;

import tema5.ej1persona.DNI;
import tema5.ej1persona.Persona;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Oficina {
    public String nombre;
    public ArrayList<Persona> trabajadores;

    public Oficina(String nombre){
        this(nombre, 0);
    }

    public Oficina(String nombre, int tipo){
        if (tipo < 0 || tipo > 3){
            throw new IllegalArgumentException("El tipo introducido no se encuentra entre 1 y 3");
        }
        this.nombre = nombre;
        this.trabajadores = new ArrayList<>();
        if (tipo >= 0 && tipo <= 3) {
            switch (tipo){
                case 3: trabajadores.add(new Persona("Ana Diaz Diaz", new DNI("33333333P"), 1200.0,LocalDate.of(2000,2,28)));
                case 2: trabajadores.add(new Persona("Luis Lopez Lopez", new DNI("22222222J"), 1000.0,LocalDate.of(1995,9,10)));
                case 1: trabajadores.add(new Persona("Antonio Perez Perez", new DNI("11111111H"), 900.0,LocalDate.of(2000,2,28)));
            }
        }
    }

    public Oficina(){
        this("Industrias DAW", 3);
    }

    public void añadirEmpleados(Persona p){
        this.trabajadores.add(p);
    }
    public void añadirEpleado(String nombre, String DNI, double sueldo, LocalDate fechaNac){
        Persona persona = new Persona(nombre, new DNI(DNI), sueldo, fechaNac);
        this.trabajadores.add(persona);
    }

    public int getTotalEmpleados(){
        return this.trabajadores.size();
    }

    public int getTotalMileuristas(){
        int cont = 0;
        for (int i = 0; i < this.trabajadores.size(); i++) {
            if (this.trabajadores.get(i).esMileurista()){
                cont++;
            }
        }
        return cont;
    }

    public boolean trabaja(Persona p){
        boolean trab = false;
        if (this.trabajadores.contains(p)){
            trab = true;
        }
        return trab;
    }

    public void pagarEmpleados(){
        for (int i = 0; i < this.trabajadores.size(); i++) {
            this.trabajadores.get(i).cobrarSueldo();
        }
    }

    public void mostrarInformeEmpleados(){
        for (int i = 0; i < this.trabajadores.size(); i++) {
            System.out.println(this.trabajadores.get(i).nombre + "\n" + this.trabajadores.get(i).sueldo + "\n" +this.trabajadores.get(i).esMileurista());
        }
    }

    public double getSueldoMedio() throws IOException{
        double suma = 0;
        if (this.getTotalEmpleados() == 0){
            throw new IOException("No hay trabajadores en la oficina");
        }

        for (int i = 0; i < this.trabajadores.size(); i++) {
                suma += this.trabajadores.get(i).sueldo;
        }
        return suma/this.trabajadores.size();
    }

    public static Oficina getOficinaVacia(){
        return new Oficina("Oficina vacia", 0);
    }
    public static Oficina getOficinaPequeña(){
        return new Oficina("Oficina pequeña", 1);
    }
    public static Oficina getOficinaMediana(){
        return new Oficina("Oficina mediana", 2);
    }
    public static Oficina getOficinaGrande(){
        return new Oficina("Oficina grande", 3);
    }
}
