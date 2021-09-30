import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//system.in leer informacion de la consola
        System.out.println("Escriba un nombre:");//pide por pantalla que un nombre
        String nombre = scanner.nextLine();//guarda el nombre en la variable nombre
        System.out.println("nombre = " + nombre);//muestra por pantalla el resultado de la variable nombre
    }
}
