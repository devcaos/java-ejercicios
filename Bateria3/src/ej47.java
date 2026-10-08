import java.util.*;
public class ej47 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce los euros: "); 
		double euros =teclado.nextDouble();
		final double equivalencia = 1.10;
		double resultado= euros * equivalencia;
		double resultado1= resultado * 100;
		double resultadofinal= Math.round(resultado1) / 100.00;

		System.out.println (euros + " € " + "equivalen a " + (resultadofinal) + "$.");
				
		
		teclado.close();
	}

}
