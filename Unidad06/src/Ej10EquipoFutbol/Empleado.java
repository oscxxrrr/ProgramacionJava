package Ej10EquipoFutbol;

public class Empleado {
    private String nombre;
    private double sueldo;
    private double dinero;

    public Empleado(String n, double s){
        this.nombre = n;
        this.sueldo = s;
        this.dinero = 0;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public double getDinero(){
        return this.dinero;
    }

    public void cobrar(double cantidad) throws CabreoException{
        //De esta manera le pagan aunque despues salte el error de que no le han pagado todo.
        this.dinero = this.dinero + cantidad;
        if (cantidad < sueldo){
            throw new CabreoException("El empleado " + this.nombre + " no se le han pagado " + (this.sueldo - cantidad));
        }
    }

}
