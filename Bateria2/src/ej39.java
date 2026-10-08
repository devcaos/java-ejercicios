import java.util.Scanner;

public class ej39 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.print("Introduce el precio: ");
		double a = teclado.nextDouble();
		System.out.print("Introduce la cantidad: ");
		int b = teclado.nextInt() ;
		double total = a * b;
	System.out.println("El precio total es " + total);
	
teclado.close();

	}

}
