import java.util.Scanner;

public class ej37 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int a = teclado.nextInt();
		System.out.print("Introduce el segundo número: ");
		int b = teclado.nextInt();
		System.out.println("La suma es " + (a + b));
	
	teclado.close();

}

}
