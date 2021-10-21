package Cine;

class Espectadores extends Personas {
   private String fila;
    private int silla;
    private String sala;

    public Espectadores(String nombre, int edad,String fila,int silla) {
        super(nombre, edad);
        super.setEdad(edad);
        super.setNombre(nombre);
        this.fila=fila;
        this.silla=silla;
    }
    public String getButaca(){
        return this.fila + this.silla;
    }


    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public String toString() {
        return "nombre:"+getNombre()+"edad:"+getEdad()+"fila:"+fila+"silla"+silla;
    }
    public void setSala(String sala){
        this.sala = sala;
    }
    public String getSala(){
        return this.sala;
    }
}
