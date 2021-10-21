package Cine;
import java.util.Scanner;
public class Cine {
    public static void main(String[] args) {//Consigna 2: Por medio del código crear una sala con capacidad para 3 personas llamada “Sala 01” en donde se proyecte la película “Jocker”.
        Salas sala = new Salas(3, "Sala 01", "Jocker");
        //Consigna 3: asignar la sala a los espectadores cargados
        //falta hacer recorrer el array de empleados y a cada objeto hacerle el .setSala(sala.nombre)
        //Consigna 4: Imprimir la lista de espectadores que se encuentran asignado a la sala.
        System.out.println("Espectadores: " + sala.getEspectadores());
        //Consigna 5: Crear un acomodador por medio del código.
        Acomodadores acomodador1 = new Acomodadores("Juan", 35);
        //Consigna 6: Asignar a dicho Acomodador la sala creada anteriormente.
        acomodador1.setSala(sala.getNombre());
        //Consigna 7: Asignar un sueldo de $50.000 al Acomodador.
        acomodador1.setSueldo(50000);
        //Consigna 8: Mostrar los datos del Acomodador en la consola.
        System.out.println("Acomodador 1: " + acomodador1.toString());
        //Consigna 9: Crear un Empleado.
        Empleados empleado1 = new Empleados("Alan", 32);
        empleado1.setSueldo(30000);
        //Consigna 10: Mostrar los datos del Empleado.
        System.out.println("Empleado 1: " + empleado1.toString());

        //Consigna 1: while para cargar los datos de los eespectadores uno por uno y pusehar en un array
        // falta hacer carga de los datos y adentor un if que compare if(sala.capicidad < arrayDeEmpleados)
        // y si es menor devolver un mensaje quellego a la capaidad maxima y sino que pida los datos para agregar el espectador


    }
}

