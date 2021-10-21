package Cine;

public class Acomodadores extends Empleados implements ParaAcomodador{
   private String sala;
    private double sueldo;
    //constructor
    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
        super.setNombre(nombre);
        super.setEdad(edad);
    }


    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getTipo(){
        return "Acomodador";
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "\n" + "Nombre: " + getNombre() + "\n" + "Edad: " + getEdad() + "\n" + "Sueldo: " + sueldo + "\n" + "Sala: " + sala;
    }

    @Override
    public void setSala(Salas sala) {}

    public String getSala() {
        return this.sala;
    }
}

