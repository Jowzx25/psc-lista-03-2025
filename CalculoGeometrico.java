import java.util.Scanner;

public class CalculoGeometrico {

    public static void main(String[] args) {
        final double PI = 3.141592;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Perimetro do circulo");
        System.out.println("2: Area do circulo");
        System.out.println("3: Volume da esfera");
        System.out.print("Digite o codigo da operacao: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        if (operacao == 1) {
            double perimetro = 2 * PI * raio;
            System.out.println("O perimetro do circulo e: " + perimetro);
        } else if (operacao == 2) {
            double area = PI * Math.pow(raio, 2);
            System.out.println("A area do circulo e: " + area);
        } else if (operacao == 3) {
            double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
            System.out.println("O volume da esfera e: " + volume);
        } else {
            System.out.println("Codigo de operacao invalido.");
        }

        scanner.close();
    }
}