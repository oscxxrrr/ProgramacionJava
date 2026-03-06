public enum Formato {
    TEXTO, HTML, JSON, XML, MD, YAML;
    public boolean humanReadable(){
        return this.ordinal()==0 || this.ordinal() == Formato.values().length-1|| this.ordinal() == Formato.values().length-2;
    }
}
