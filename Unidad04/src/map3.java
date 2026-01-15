import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map3 {
    public static void main(String[] args) {
        Map<String, Integer> empleados = new HashMap<>();
        empleados.put("Oscar", 1975);

        System.out.println("Introduce el usuario: ");
        String user = new Scanner(System.in).nextLine();

        if (empleados.containsKey(user)){
            System.out.println("Introduce la contraseña: ");
            int pin = new Scanner(System.in).nextInt();
            if (empleados.get(user) != pin){
                System.out.println("Contraseña incorrecta");
            }else {
                System.out.println("ACCESO PERMITIDO");
            }

        }else {
            System.out.println("Usuario incorrecto.");

        }
    }
}
