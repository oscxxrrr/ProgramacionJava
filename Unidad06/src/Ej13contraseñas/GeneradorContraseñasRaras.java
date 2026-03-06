package Ej13contraseñas;

import java.util.Random;

public class GeneradorContraseñasRaras extends GeneradorContraseñasUnicas{
    public GeneradorContraseñasRaras(){
        super();
    }
    public GeneradorContraseñasRaras(Random r){
        super(r);
    }
    public String generarContraseña(int longitud){
        StringBuilder stringBuilder = new StringBuilder();
        String contra = super.generarContraseña(longitud);
        for (int i = 0; i < contra.length(); i++) {
            int c = contra.charAt(i);
            stringBuilder.append((char)(c + 122));
        }
        return stringBuilder.toString();
    }
}
