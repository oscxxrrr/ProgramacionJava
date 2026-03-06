package records;

public class main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno(1, "Juan", 21, "Tortola, 37", false);
        Alumno a2 = new Alumno(1, "Juan", 21, "Tortola, 37", false);

        if (a1.equals(a2)){
            System.out.println("Los alumnos son iguales");
        }
    }
}
