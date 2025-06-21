package calculadora;
import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double numero1, numero2, resultado;
        char operador;

        System.out.println(" Calculadora ");

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

	}

}
