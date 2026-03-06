package tema5.DNImejorado;

public class DNImejorado {
    private int numero;
    private char letra;

    public DNImejorado(int n){
        this.numero = n;
        this.letra = this.calcularLetra(numero);
    }
    public int getNumero(){
        return this.numero;
    }

    public char getLetra() {
        return this.letra;
    }

    private char calcularLetra(int n){
        char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E','T'};
        int pos = this.numero % 23;
        return letra[pos];
    }
}
