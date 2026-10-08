import java.util.Scanner;
public class ej54 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce los kilos: ");
		double kilos = teclado.nextDouble();
		
		
	System.out.println(kilos + " kgs " + "equivalen a " + (kilos *1000) + " g.");
		
teclado.close();
	}

}