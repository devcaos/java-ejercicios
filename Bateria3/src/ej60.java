import java.util.Scanner;
public class ej60 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine(); 
		System.out.print("Introduce tu primer apellido: ");
		String apellido1 = teclado.nextLine(); 
		System.out.print("Introduce tu segundo apellido: ");
		String apellido2 = teclado.nextLine(); 
		
		System.out.println("Las iniciales de tu nombre completo son " + nombre.charAt(0) + apellido1.charAt(0) + apellido2.charAt(0));

teclado.close();
	}

}

