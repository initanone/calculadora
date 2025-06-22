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
        switch (operador) {
        case '+':
            resultado = numero1 + numero2;
            break;
        case '-':
            resultado = numero1 - numero2;
            break;
        case '*':
            resultado = numero1 * numero2;
            break;
        case '/':
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
                return;
            }
            break;
        default:
            System.out.println("Operador inválido!");
            return;
    }

    System.out.println("O resultado é: " + resultado);

    scanner.close();

	}

}
