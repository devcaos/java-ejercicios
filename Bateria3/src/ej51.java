import java.util.Scanner;
public class ej51 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el precio: ");
		double precio = teclado.nextDouble();
	
	System.out.println("Aplicando el descuento del 15% quedaria en: " + (precio * 0.85) + " €.");
	
teclado.close();
	}

}
