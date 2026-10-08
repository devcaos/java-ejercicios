import java.util.Scanner;

public class ej38 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Primer número: ");
		int a = teclado.nextInt();
		System.out.print("Segundo número: ");
		int b = teclado.nextInt();
		System.out.println("Suma: " + (a + b));
		System.out.println("Resta: " + (a - b));
		System.out.println("Multiplicación: " + (a * b)); 
		System.out.println("División: " + (a / b));

		teclado.close();

	}

}
