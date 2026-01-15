package Ejercicios;

import static java.lang.System.getProperty;

public class Ejercicio39 {
    public static void main(String[] args) {
        String separator = System.getProperty("file.separator");
        System.out.println("Separar carpeteas /  : "+separator);
        String jre = System.getProperty("java.home");
        System.out.println("Carpeta donde esta instalado jre: "+jre);
        String vendor = System.getProperty("java.vendor");
        System.out.println("Fabricante jre: "+vendor);
        String version = System.getProperty("java.version");
        System.out.println("Version jre: "+version);
        String arquitectura = System.getProperty("os.arch");
        System.out.println("Arquitectura sistema operativo: "+arquitectura);
        String name = System.getProperty("os.name");
        System.out.println("Sistema operativo: "+name);
        String so = System.getProperty("os.version");
        System.out.println("Version sistema operativo: "+so);
        String dir = System.getProperty("user.home");
        System.out.println("Ubicacion carpeta usuario: "+dir);
        String userName = System.getProperty("user.name");
        System.out.println("Nombre usuario: "+userName);
    }
}
