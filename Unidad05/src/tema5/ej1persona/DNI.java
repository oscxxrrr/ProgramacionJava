package tema5.ej1persona;

public class DNI {
    private int numero;
    private char letra;

    public DNI(int n, char l){
        this.numero = n;
        this.letra = l;
    }
    public DNI(String dni){
        this(Integer.parseInt(dni.substring(0, dni.length() - 1)), dni.charAt(dni.length()-1));
    }

    public int getNumero(){
        return this.numero;
    }
    public char getLetra(){
        return this.letra;
    }



}
