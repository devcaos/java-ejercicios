import java.util.Scanner;
public class ej59 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String palabra = teclado.nextLine();
		
	System.out.println("Esa palabra tiene " + palabra.length() + " caracteres.");

teclado.close();
	}

}
