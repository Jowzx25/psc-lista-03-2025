import java.util.Scanner;
import java.lang.Math;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Digite o simbolo da operacao (+, -, *, /, ^): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro: Divisao por zero.");
                    operacaoValida = false;
                } else {
                    resultado = num1 / num2;
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            default:
                System.out.println("Simbolo de operacao invalido.");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("O resultado da operacao e: " + resultado);
        }

        scanner.close();
    }
}