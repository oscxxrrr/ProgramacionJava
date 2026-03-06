package tema5.ej1persona;

import tema5.ej7cuentaCorriente.CuentaCorriente;

import java.time.LocalDate;
import java.util.Random;

public class Persona {
    public String nombre;
    public DNI dni;
    public double sueldo;
    public CuentaCorriente cuenta;
    public LocalDate fechaNacimiento;
    public Persona(String n, DNI d, double s, LocalDate fn){
        this.nombre = n;
        this.dni = d;
        this.sueldo = s;
        this.fechaNacimiento = fn;
        this.cuenta = new CuentaCorriente();
    }
    public Persona(String n,int numDNI,char letraDNI,double s, LocalDate fn){
        this(n,new DNI(numDNI,letraDNI),s,fn);
    }
    public Persona(String n, DNI d){
        this(n,d,900,LocalDate.now().minusYears(20));
    }
    public Persona(String n,int numDNI, char letraDNI){
        this(n,new DNI(numDNI,letraDNI));
    }
    public void aumentarSueldo(int porcentaje){
        this.sueldo+=this.sueldo*porcentaje/100;
    }
    public void cobrarSueldo(){
        this.cuenta.añadirDinero((int)(this.sueldo));
    }

    public boolean esMayorEdad() {
        return this.fechaNacimiento.plusYears(18).isBefore(LocalDate.now()) || this.fechaNacimiento.plusYears(18).isEqual(LocalDate.now());
    }


    public boolean tieneDinero() {
        return this.cuenta.saldo > 0;
    }


    public boolean esMileurista(){
        boolean mileurista = false;
        if (this.sueldo < 1200){
            mileurista = true;
        }
        return mileurista;
    }


}
