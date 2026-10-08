import java.util.*;
public class ej49 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce los segundos: ");
		int segundos = teclado.nextInt();
		int minutos = segundos / 60;
		int resto = segundos % 60;
		
		System.out.println(minutos + " minutos y " + resto + " segundos. ");
		
teclado.close();

	}

}
