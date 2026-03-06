package Ej13contraseñas;

import java.util.Random;

public class GeneradorContraseñasInvertidas extends GeneradorContraseñasUnicas{
    public GeneradorContraseñasInvertidas(){
        this(new Random());
    }
    public GeneradorContraseñasInvertidas(Random r){
        super(r);
    } 
    public String generarContraseña(int longitud){
        StringBuilder stringBuilder = new StringBuilder();
        String contra = super.generarContraseña(longitud);
        System.out.println("Contraseña: " + contra);
        for (int i = 0; i < contra.length(); i++) {
            char c = contra.charAt(i);
            if (Character.isUpperCase(c)){
                stringBuilder.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
