import org.apache.commons.validator.routines.EmailValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.validator.routines;

public class CuentaPersonal implements EnviadorCorreo, ReceptorCorreo{
    private String direccionCorreo;
    private List<Mensaje> buzon;

    private CuentaPersonal(String direccion){
        if (!CuentaPersonal.validarDireccion(direccion)){
            throw new IllegalArgumentException("El correo " + direccion + " es incorrecta.");
        }
        this.direccionCorreo = direccion;
        this.buzon = new ArrayList<>();
    }

    private CuentaPersonal(String usuario, String dominio){
        this(usuario + dominio);
    }

    private static boolean validarDireccion(String direccion){
        return EmailValidator.getInstance().isValid(direccion);
    }

    public List<Mensaje> getMensajes(){
        return this.buzon;
    }
    public List<Mensaje> getMensajes(boolean estado){
        List<Mensaje> mensajes = new ArrayList<>();
        for (int i = 0; i < this.buzon.size(); i++) {
            if (mensajes.get(i).leido() == estado){
                mensajes.add(this.buzon.get(i));
            }
        }
        return mensajes;
    }

    public int leer(){
        int leidos = 0;
        for (int i = 0; i < this.buzon.size(); i++) {
            if (!this.buzon.get(i).leido()){
                this.buzon.set(i,this.buzon.get(i).leer());
                leidos++;
            }
        }
        return leidos;
    }

    public boolean guardarMensajes(String ruta){
        boolean resultado = true;
        File archivo = new File(ruta);
        try {
            PrintWriter printWriter = new PrintWriter(archivo);
            for(Mensaje m: this.buzon){
                printWriter.println(m.getLineaCSV());
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            resultado = false;
        }
        return resultado;
    }

    public void cargarMensaje(){

    }

    @Override
    public String getDireccionCorreo() {
        return "";
    }

    @Override
    public void recibirMensaje(Mensaje m) {

    }
}
