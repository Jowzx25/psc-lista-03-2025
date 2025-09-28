import java.util.Scanner;
import java.util.Random;

public class SorteioNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int menor, maior;
        if (num1 < num2) {
            menor = num1;
            maior = num2;
        } else {
            menor = num2;
            maior = num1;
        }

        Random random = new Random();
        int numeroSorteado = random.nextInt(maior - menor + 1) + menor;

        if (numeroSorteado % 2 == 0) {
            System.out.println("O numero sorteado foi " + numeroSorteado + ", e ele e um numero par.");
        } else {
            System.out.println("O numero sorteado foi " + numeroSorteado + ", e ele e um numero impar.");
        }

        scanner.close();
    }
}