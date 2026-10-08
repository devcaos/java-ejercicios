import java.util.*;
public class ej43 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			System.out.print("Introduce la primera nota: ");
			double nota1 = teclado.nextDouble();
		
			System.out.print("Introduce la segunda nota: ");
			double nota2 = teclado.nextDouble();
		
			System.out.print("Introduce la tercera nota: ");
			double nota3 = teclado.nextDouble();
			
		double resultadosuma = (nota1 + nota2 + nota3);
		double media = (resultadosuma / 3); 
		double media1 = Math.round(media * 100);
		double mediatotal = (media1 / 100);
		
	 System.out.println("La media de las 3 notas es " + mediatotal);
		
		teclado.close();
	}

}
