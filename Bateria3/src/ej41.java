import java.util.Scanner;

public class ej41 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine(); 
		System.out.print("Introduce tu edad: ");
		int edad = teclado.nextInt();
		System.out.println("Hola " + nombre + ". " + "Tienes " + edad + " años.");

		
		
		teclado.close();

	}

}
