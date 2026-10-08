import java.util.Scanner;

public class ej76 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el precio: ");
        double precio = teclado.nextDouble();
        if (precio >= 100) {
            System.out.print("Aquí tienes tu precio con el descuento del 10% aplicado --> " + (precio *0.9) + "€");
        }
        else {
            System.out.print("No hay descuento. Tienes que pagar: " + precio + "€");
        }

        teclado.close();
    }
}
