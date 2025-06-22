package funcionalidade;

import java.util.Scanner;

public class Feature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Calculadora ");

        while (true) {
            double numero1, numero2, resultado;
            char operador;

            System.out.print("\nDigite o primeiro número: ");
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
                        continue; // volta ao início do laço
                    }
                    break;
                default:
                    System.out.println("Operador inválido!");
                    continue; // volta ao início do laço
            }

            System.out.println("Resultado: " + resultado);

            System.out.print("\nDeseja realizar outra operação? (s/n): ");
            char resposta = scanner.next().charAt(0);

            if (resposta != 's' && resposta != 'S') {
                System.out.println("Encerrando a calculadora. Até mais!");
                break;
            }
        }

        scanner.close();
    }
}
