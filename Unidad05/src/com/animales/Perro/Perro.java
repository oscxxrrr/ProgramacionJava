package com.animales.Perro;
import java.awt.Point;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class Perro {
    //VARUIABLE STATICA
    private static int totalPerros = 0;
    //VARIABLES DE INSTANCIA
    private int edad;
    private String nombre;
    private String raza;
    private boolean hambriento;
    private Point posición;

//CONSTRUCTORES
    public Perro(String n, int e, String r){
        this(n,e,r,new Point(0,0),true);
    }

    public Perro(String n, int e, String r, Point p, boolean h){
        this.nombre = n;
        this.edad = (e>0)? e:1;
        this.raza = r;
        this.posición = p;
        this.hambriento = h;
        Perro.totalPerros++;
    }

    public Perro(String n, int e, String r,int x, int y, boolean h){
        this(n,e,r,new Point(x,y),h);
    }

    //metodos instancia
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void mostrarAñoNacimiento(){
        LocalDate hoy = LocalDate.now();
        int año = hoy.getYear();
        int añoNacimiento = año - this.edad;
        System.out.println("El perro tiene " + (año - añoNacimiento) + " años.");
    }

    public void ladrar(){
        if (this.hambriento){
            System.out.println("guau");
        }else {
            for (int i = 0; i < 5; i++) {
                System.out.println("GUAU");
            }
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getRaza(){
        return this.raza;
    }

    public int getEdad(){
        return this.edad;
    }
    public boolean getHambriento(){
        return this.hambriento;
    }

    public void setHambriento(boolean h ){
        this.hambriento = h;
    }
    public Point getPosicion(){
        return this.posición;
    }

    public void setEdad(int e){
        if (e>0){
            this.edad = e;
        }else {
            throw new IllegalArgumentException("Edad negativa");
        }
    }

    public void comer() throws IOException {
        if (this.hambriento){
            this.hambriento = false;
        }else {
            throw new IOException("No puede comer porque no tiene hambre");
        }
    }
    public void guardar(String ruta) throws IOException{
        PrintWriter pr = new PrintWriter(ruta);
        pr.println(this.nombre);
        pr.println(this.edad);
        pr.println(this.raza);
        pr.close();
    }
    public static int getTotalPerros(){
        return Perro.totalPerros;
    }
}
