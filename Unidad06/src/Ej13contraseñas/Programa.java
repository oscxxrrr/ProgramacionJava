package Ej13contraseñas;

public class Programa {
    public static void main(String[] args) {
        GeneradorConstraseñas generadorConstraseñas = new GeneradorConstraseñas();
        System.out.println();
        System.out.println(generadorConstraseñas.generarContraseña(5));
        System.out.println(generadorConstraseñas.generarContraseña());

        GeneradorContraseñasUnicas generadorContraseñasUnicas = new GeneradorContraseñasUnicas();
        System.out.println();
        System.out.println(generadorContraseñasUnicas.generarContraseña());
        System.out.println(generadorContraseñasUnicas.generarContraseña(10));

        GeneradorContraseñasArchivo generadorContraseñasArchivo = new GeneradorContraseñasArchivo("archivo.txt");
        System.out.println();
        generadorContraseñasArchivo.generarContraseña(10);
        generadorContraseñasArchivo.generarContraseña();

        GeneradorContraseñasInvertidas generadorContraseñasInvertidas = new GeneradorContraseñasInvertidas();
        System.out.println();
        System.out.println(generadorContraseñasInvertidas.generarContraseña(10));

        GeneradorContraseñasRaras generadorContraseñasRaras = new GeneradorContraseñasRaras();
        System.out.println();
        System.out.println(generadorContraseñasRaras.generarContraseña(10));
    }
}
