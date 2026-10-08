import java.util.Scanner;
public class ej58 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Introduce tus apellidos: ");
		String apellidos = teclado.nextLine();
		
	System.out.println(nombre + " " + apellidos);

teclado.close();
	}

}
