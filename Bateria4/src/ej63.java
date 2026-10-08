import java.util.Scanner;
public class ej63 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();
        if (edad < 18)

            System.out.print("Menor de edad");

        else
            System.out.println("Mayor de edad");

        teclado.close();
    }

}
