import java.time.LocalDate;
import java.util.*;

public class map {
    public static void main(String[] args) {
//        Map<String, LocalDate> fechas = new HashMap<>();
//        fechas.put("41606202F",LocalDate.of(2007,1,2));
//        fechas.put("45678788P",LocalDate.of(2009,2,8));
//        System.out.println("introduce el dni: ");
//        String dni = new Scanner(System.in).nextLine();
//        LocalDate fecha = fechas.get(dni);
//        if (fecha!=null){
//            System.out.println("Fehca nacimiento es: " + fecha);
//        }else {
//            System.out.println("DNI no registrado");
//        }
//
//        if (fechas.containsKey(dni)){
//            System.out.println("DNI Registrado");
//        }else {
//            System.out.println("DNI no registrado");
//        }
//
//        Set<String> claveFechas = fechas.keySet();
//        for (String nombre : claveFechas) {
//            System.out.println(nombre + " - " + fechas.get(nombre));
//        }
//
//

        Map<String,String> direcciones = new HashMap<>();
        direcciones.put("Juan", "Pedro Antonio Alarcon");
        direcciones.put("Pepe", "Calle Tortola");
        direcciones.put("Luis", "Alhamar");
        direcciones.put("Pedro", "Pepe alarcon");

        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 19);
        edades.put("Pepe", 21);
        edades.put("Luis", 32);
        edades.put("Pedro", 22);

        Set<String> claveDirecciones = direcciones.keySet();
        for (String nombres : claveDirecciones){
            String direccion = direcciones.get(nombres);
            int edad = edades.get(nombres);
            System.out.println(direccion + " - " + edad);
        }

        Map<String, Integer> codigo = new HashMap<>();
        codigo.put("Pedro Antonio Alarcon",18003);
        codigo.put("Calle Tortola", 11231);
        codigo.put("Alhamar",78123);
        codigo.put("Pepe alarcon", 90727);

        Map<String, Integer> calculoPersonas = new HashMap<>();
        for (String nombre : claveDirecciones){
            String dir = direcciones.get(nombre);
            int numCaractres = dir.length();
            int calculado = numCaractres * codigo.get(dir);
            calculoPersonas.put(nombre,calculado);
        }
        System.out.println(calculoPersonas);
    }
}
