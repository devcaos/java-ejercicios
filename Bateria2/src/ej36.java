	import java.util.Scanner; 


public class ej36 {
 
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
			System.out.print("Introduce tu nombre: ");
			String nombre = teclado.nextLine();
			System.out.print("Introduce tu localidad: ");
			String localidad = teclado.nextLine();
		System.out.println("Me llamo " + nombre + " y vivo en " + localidad);
		
	teclado.close();

	}

}
