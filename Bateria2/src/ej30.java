
import java.util.Scanner;

public class ej30 {
    public static void main(String[] args) {
        // Inicia el objeto Scanner para la entrada de datos
        Scanner teclado = new Scanner(System.in);
        // Pide un número al usuario
        System.out.print("Introduce un número: ");
        // Lee el valor entero introducido por el usuario
        int numero = teclado.nextInt();
        // Imprime el número recogido por pantalla
        System.out.println("Has introducido el número " + numero);
        // Cierra el objeto Scanner
        teclado.close();
    }
}