import java.util.*;
public class ej56 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce la base: ");
		int base = teclado.nextInt();
		System.out.print("Introduce el exponente: ");
		int exponente = teclado.nextInt();
		
	System.out.println("El resultado de elevar " + base + " a "+ exponente + " es " + Math.pow(base, exponente));
		
		
teclado.close();
	}

}
