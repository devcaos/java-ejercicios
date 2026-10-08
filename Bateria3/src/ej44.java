import java.util.Scanner;

public class ej44 {
 public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Introduce la temperatura en grados Celsius: ");
		double grados = teclado.nextDouble();
		
		System.out.println( Math.round(grados) + "ºC "  + "equivalen a " + Math.round(grados * 9 / 5 + 32) + "ºF");
	
	
	teclado.close();
 }
}
