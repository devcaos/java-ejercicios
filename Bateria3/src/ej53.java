import java.util.Scanner;
public class ej53 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce los kilómetros: ");
		int kms = teclado.nextInt();
		System.out.print("Introduce los metros: ");
		int metros = teclado.nextInt();
		
	System.out.println(kms + " km y " + metros + " m equivalen a " + (kms *1000 + metros) + " metros.");
		
teclado.close();
	}

}
