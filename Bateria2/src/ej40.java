		import java.util.Scanner;

public class ej40 {

	
		public static void main(String[] args) {
			Scanner teclado = new Scanner (System.in);
			System.out.print("Introduce tu año de nacimiento: ");
			int annionacimiento = teclado.nextInt();
			int annioactual = (2026);
			int edad = annioactual - annionacimiento; 
			System.out.println("Tu edad aproximada es " + edad);
		
		teclado.close();
	}

}
