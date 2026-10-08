import java.util.*;

public class ej50 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el precio sin IVA: ");
		double precio = teclado.nextDouble();
		
	System.out.println("El precio con IVA es " + (precio *1.21) + " €.");
		
teclado.close();
	}

}
