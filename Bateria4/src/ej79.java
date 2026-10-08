import java.util.*;
public class ej79 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer lado: ");
        double lado1 = teclado.nextDouble();

        System.out.print("Introduce el segundo lado: ");
        double lado2 = teclado.nextDouble();

        System.out.print("Introduce el tercer lado: ");
        double lado3 = teclado.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isósceles.");
            } else {
                System.out.println("Escaleno.");
            }

        } else {
            System.out.println("Los valores introducidos no forman un triángulo válido.");
        }

        teclado.close();
    }
}