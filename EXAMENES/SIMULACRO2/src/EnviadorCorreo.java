public interface EnviadorCorreo {
    public abstract String getDireccionCorreo();
    public default void enviarMensaje(ReceptorCorreo destinatario, String textoMensaje, Formato tipo){
        destinatario.recibirMensaje(new Mensaje(this.getDireccionCorreo(),textoMensaje,false,tipo));
    }
    public default String getNombre(){
        return this.getDireccionCorreo();
    }
    public default String getDominio(){
        int pos = this.getDireccionCorreo().indexOf('@');
        return this.getDireccionCorreo().substring(pos);
    }
}
