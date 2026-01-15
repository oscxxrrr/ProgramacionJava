package Ejercicios;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("mesa");
        palabras.add("silla");
        palabras.add("reloj");
        palabras.add("perro");
        int vidas = 4;
        String palabra = null;
        boolean palabraAcertada = false;
        String vistaUsuario = "";
        while(!palabras.isEmpty() && vidas>0){
            palabraAcertada = false;
            Collections.shuffle(palabras);
            palabra = palabras.remove(0);
            vistaUsuario = "";
            boolean[] aciertos = new boolean[palabra.length()];

            for(int j=0; j<aciertos.length; j++){
                vistaUsuario+="-";
            }
            do{
                System.out.println(vistaUsuario);
                System.out.println("Vidas: " + vidas);
                System.out.println("Introduce una letra");
                char letra = new Scanner(System.in).nextLine().charAt(0);
                if(palabra.contains(letra+"")){
                    for(int k=0; k<palabra.length(); k++){
                        if(palabra.charAt(k)==letra){
                            aciertos[k] = true;
                        }
                    }
                    vistaUsuario = "";
                    for(int z=0; z<aciertos.length; z++){
                        if(aciertos[z]==false){
                            vistaUsuario+="-";
                        }else{
                            vistaUsuario+=palabra.charAt(z);
                        }
                    }
                }else{
                    vidas--;
                }
                if(vistaUsuario.equals(palabra)){
                    palabraAcertada = true;
                }
            }while(vidas>0 && !palabraAcertada);
            if(palabraAcertada){
                System.out.println("PALABRA ACERTADA!");
            }else{
                System.out.println("HAS PERDIDO!");
            }
        }
    }
}
