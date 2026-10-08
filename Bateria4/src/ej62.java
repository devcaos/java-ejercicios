import java.util.*;
public class ej62 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        int num1 = teclado.nextInt();
        int par = (num1 % 2);
        if (par == 0) {
            System.out.println("Ese numero es par");
        }
        else
            System.out.println("El numero es impar");



        teclado.close();
    }

}

