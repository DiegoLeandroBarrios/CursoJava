import java.util.Scanner;

public class entrada_salida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//System.in es para que este a la escucha de lo que escribimos
        System.out.println("introduce tu nombre por favor: ");
        String nombre = entrada.nextLine();//almaceno en una variable tipo cadena

        System.out.println("hola "+ nombre);

    }
}
