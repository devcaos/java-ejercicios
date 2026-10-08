import java.util.*;
public class ej45 {
 
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce la base: ");
		int base = teclado.nextInt();
		System.out.print("Introduce la altura: ");
		int altura = teclado.nextInt();
	System.out.println("El área es " + (base * altura) + ". El perímetro es " + (2 * base + 2 * altura));

	teclado.close();
	}

}
