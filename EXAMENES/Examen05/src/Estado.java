public enum Estado {
    ENCENDIDA_OK, ENCENDIDA_AVERIADA, APAGADA;
    public boolean estaEncendido(){
        boolean respuesta = false;
        if (ordinal() == 0){
            respuesta = true;
        }
        return respuesta;
    }
}
