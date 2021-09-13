import java.util.Scanner;

public class EntradatextoYnumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//System.in es para que este a la escucha de lo que escribimos

        System.out.println("introduce tu nombre por favor: ");

        String nombre = entrada.nextLine();//almaceno en una variable tipo cadena

        System.out.println("hola "+ nombre);

        System.out.println("Itroduzca edad: ");

        int edad = entrada.nextInt();

        System.out.print("la edad de "+ nombre );

        System.out.println(" es:\t"+ edad);

    }
}
