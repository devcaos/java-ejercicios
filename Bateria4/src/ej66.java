import java.util.Scanner;
public class ej66 {
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

System.out.print("Introduce tu nota: ");

double nota = teclado.nextDouble();
if (nota < 5) {
    System.out.println("Insuficiente");
        }
else if (nota < 6) {
    System.out.println("Suficiente");
    }
else if (nota < 7) {
    System.out.println("Bien");
}
else if (nota < 9) {
    System.out.println("Notable");
}
else if (nota <= 10) {
    System.out.println("Sobresaliente");
}
else System.out.println("Nota no valida");

        teclado.close();
    }
}
