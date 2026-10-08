import java.util.Scanner;
public class ej64 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.print(numero1 + " es  mayor");

        } else if (numero1 == numero2) {
            System.out.print("Son iguales");

        } else {
            System.out.println(numero2 + " es mayor");
        }
        teclado.close();
    }

}
