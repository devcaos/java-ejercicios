import java.util.*;

public class ej78 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu peso: ");
        double peso = teclado.nextDouble();
        System.out.print("Introduce tu altura: ");
        double altura = teclado.nextDouble();
        double masacorporal = peso / Math.pow(altura, 2);
        if (masacorporal < 18.5) {
            System.out.print("Bajo peso");
        } else if (masacorporal >= 18.5 && masacorporal < 25) {
            System.out.print("Normal");
        } else if (masacorporal >= 25 && masacorporal < 30) {
            System.out.print("Sobrepeso");
        } else {
            System.out.print("Obesidad");
        }

        teclado.close();
    }
}
