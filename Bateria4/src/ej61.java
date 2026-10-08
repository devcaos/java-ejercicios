import java.util.*;
public class ej61 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        int num1 = teclado.nextInt();
        if (num1 < 0) {
            System.out.println("Ese numero es negativo");
        } else if (num1 == 0) {
            System.out.println("El numero es 0");
        } else {
            System.out.println("Ese número es positivo");
        }
        teclado.close();
    }

}
