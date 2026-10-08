
public class ej26 {
 public static void main(String[] args) {
	 //Establece las variables de numero entero y asigna sus valores
 int dividendo = 17;
 int divisor = 5;
 	//Establece variables de numero entero asignando las operaciones aritmeticas de division y resto
 int cociente = dividendo / divisor;
 int resto = dividendo % divisor;
 	//Imprime los caracteres entre comillas y las variables cociente y resto, que aunque el cociente sea 3.4 elimina la parte decimal al ser declado como int
 System.out.println("Cociente: " + cociente);
 System.out.println("Resto: " + resto);
 }
}