import java.util.Scanner;

public class ej72 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double n1 = teclado.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double n2 = teclado.nextDouble();

        System.out.print("Introduce uno de estos operadores+, -, * o /: ");
        String operacion = teclado.next();
        switch (operacion) {
            case "+": System.out.println("Resultado: " + (n1 + n2));
                break;

            case "-": System.out.println("Resultado: " + (n1 - n2));
                break;

            case "*": System.out.println("Resultado: " + n1 * n2);
                break;

            case "/": if (n2 == 0)
                System.out.println("No se puede dividir entre 0");
              else
                  System.out.println("Resultado: " + n1 / n2);
                break;
            default: System.out.println("ERROR");
        }

        teclado.close();
    }
}
