import java.util.Scanner;
public class ej55 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime el primer número: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Dime el segundo número: ");
		int num2 = teclado.nextInt();
		
		int cociente = num1 / num2;
		int resto = num1 % num2;

	System.out.println("El cociente es " + cociente + "; el resto es " + resto + ".");
	
		teclado.close();
	}

}
