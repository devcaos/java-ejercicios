import java.util.*;
public class ej57 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduce un número: ");
		int num = teclado.nextInt();
	
	System.out.println("El resultado de la raíz cuadrada de " + num + " es " + Math.sqrt(num));
		
		
teclado.close();
	}

}
