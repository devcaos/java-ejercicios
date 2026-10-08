import java.util.Scanner;

public class ej74 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los números para saber cual es menor");
        System.out.print("Introduce el primer número: ");
        int n1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int n2 = teclado.nextInt();

        System.out.print("Introduce el tercer número: ");
        int n3 = teclado.nextInt();

        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
        }
        else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        }
        else System.out.println(n3);
        teclado.close();
    }

}
