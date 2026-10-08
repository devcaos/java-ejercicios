import java.util.Scanner;

public class ej77 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el precio del pedido para calcularlo con los gastos de envío: ");
        double pedido = teclado.nextDouble();
        if (pedido <30) {
            System.out.print("El precio con los gastos de envío es--> " + (pedido + 5) + "€");
        }
        else if (pedido >= 30 && pedido <60) {
            System.out.print("El precio con los gastos de envío es--> " + (pedido + 3) + "€");
        }
        else  {
            System.out.print("Los gastos de envío son gratis, el precio es--> " + pedido);
        }

        teclado.close();
    }
}
