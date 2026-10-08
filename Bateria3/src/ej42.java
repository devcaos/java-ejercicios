import java.util.Scanner;

public class ej42 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int a = teclado.nextInt();
		System.out.print("Introduce el segundo número: ");
		int b = teclado.nextInt();

		System.out.println("La suma de esos números es " + (a + b));
		System.out.println("La resta de esos números es " + (a - b));
		System.out.println("La multiplicación de esos números es " + (a * b));
		System.out.println("La división de esos números es " + (a / b));

		teclado.close();
	}

}
