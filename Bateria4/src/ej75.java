import java.util.Scanner;

public class ej75 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu nota: ");
        double nota = teclado.nextDouble();
        if (nota <= 10 && nota >=0) {
            System.out.print("Nota válida");
        }
        else {
            System.out.print("Nota no válida");
        }

teclado.close();
    }
}
