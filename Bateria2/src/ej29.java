		
import java.util.Scanner;

public class ej29 {
    public static void main(String[] args) {
    	// Crea el objeto Scanner para capturar la entrada por teclado
        Scanner teclado = new Scanner(System.in);
        // Solicita al usuario que introduzca su nombre
        System.out.print("Introduce tu nombre: ");
        // Lee el texto introducido por el usuario
        String nombre = teclado.nextLine();
        // Imprime un saludo personalizado usando la variable nombre
        System.out.println("Hola, " + nombre);
        // Cierra el objeto Scanner
        teclado.close();
    }
}