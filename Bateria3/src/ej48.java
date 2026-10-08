import java.util.*;
public class ej48 {
	
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Introduce las horas: ");
		int horas = teclado.nextInt();
	
	System.out.print("Introduce los minutos: ");
		int minutos = teclado.nextInt();
	
		System.out.print("Introduce los segundos: ");
		int segundos = teclado.nextInt();
	
	System.out.println("Esas " + horas + "h, " + minutos + "min y " + segundos + "s equivalen a " + (horas * 3600 + minutos * 60 + segundos) + "s.");
	
	
	
	
	teclado.close();
}
}
