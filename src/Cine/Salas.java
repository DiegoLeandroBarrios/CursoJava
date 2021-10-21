package Cine;

class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    Object[]  espectadores;

    public String getNombre() {
        return this.nombre;
    }
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
  public Salas(int capacidad,String nombre,String pelicula){
        this.capacidad=capacidad;
        this.nombre=nombre;
        this.setPelicula(pelicula);
  }
    public Object getEspectadores(){
        return espectadores;
    }
    @Override
    public String toString() {
        return "capacidad=" + capacidad +"   "+ "pelicula=" + pelicula +"  "+ "nombre=" + nombre ;
    }
}

