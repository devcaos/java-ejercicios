import java.util.Scanner;
public class ej52 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce tu sueldo: ");
		int sueldo = teclado.nextInt();
		
	System.out.println("Tu sueldo en 12 pagas son " + (sueldo * 12) + "€ al año.");
		
		
teclado.close();
	}

}
