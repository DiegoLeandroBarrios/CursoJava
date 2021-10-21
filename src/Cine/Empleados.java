package Cine;

class Empleados extends Personas{
    private double sueldo;
    public Empleados(String nombre,int edad){
        super(nombre, edad);
        super.setEdad(edad);
        super.setNombre(nombre);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public String getTipo(){
        return "Empleado";
    }

    @Override
    public String toString() {
        return "nombre="+getNombre()+"\n"+"edad="+getEdad()+"\n"+"sueldo="+sueldo;
    }
}