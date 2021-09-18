import java.util.Scanner;

public class PesoIdeal{
    public static void main(String[] args) {
        float altura;
        int genero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Altura:");
        altura = scanner.nextFloat();
        System.out.println("altura en cm= " + altura);
        System.out.println("Elija el Genero 1 para hombre y 2 para mujer:");
        genero = scanner.nextInt();
        System.out.println("genero = " + genero);
        if (genero == 1){
            altura = altura-110;
            System.out.println("tu peso ideal como hombre es =" + altura + "kg");
        }
        else if(genero == 2){
            altura = altura-120;
            System.out.println("tu peso ideal es como mujer =" + altura +"kg");
        }
        else{
            System.out.println("no puso el genero correcto");
        }
    }
}
