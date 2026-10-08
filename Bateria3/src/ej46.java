import java.util.*;

public class ej46 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el radio: ");
		double radio = teclado.nextDouble();
		int potencia = 2;
		double area1 = Math.pow(radio, potencia) * Math.PI;
		double area2 = (area1) * 100;
		double areafinal = Math.round(area2) / 100.0;
		
		double perimetro = 2 * radio * Math.PI;
		double perimetro1 = perimetro * 100;
		double perimetrofinal = Math.round(perimetro1) / 100.0;
		
	System.out.println("El área es " + areafinal + ". La longitud es " + perimetrofinal);
	
	
		teclado.close();
	}

}
