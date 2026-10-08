import java.util.Scanner;

public class ej80 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un color (rojo, amarillo o verde): ");
        String color = teclado.nextLine();

        if (color.equalsIgnoreCase("rojo")) {
            System.out.println("Parar");
        } else if (color.equalsIgnoreCase("amarillo")) {
            System.out.println("Precaución");
        } else if (color.equalsIgnoreCase("verde")) {
            System.out.println("Avanzar");
        } else {
            System.out.println("Color no válido. Introduce rojo, amarillo o verde.");
        }

        teclado.close();
    }
}