import java.io.*;

public class Ej02 {
    public static void main(String[] args) {
        int correctas = 0;
        try {
            File file = new File("matriculas.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            PrintWriter printWriter = new PrintWriter("matriculasCorregidas.txt");

            for (int i = 0; i < 800; i++) {
                String linea = bufferedReader.readLine();
                boolean vocalQ = true;

                for (int j = 0; j < linea.length() && vocalQ; j++) {
                    char caracter = linea.charAt(j);
                    if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U' || caracter == 'Q') {
                        vocalQ = false;
                    }
                }

                if (vocalQ) {
                    printWriter.println(linea);
                    correctas++;
                }
            }
            printWriter.close();
            bufferedReader.close();
            System.out.println("Se han escrito " + correctas + " matriculas correctas.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
