/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("RESOLVENDO UMA EQUACAO DE SEGUNDO GRAU (ax^2 + bx + c = 0)");
        System.out.print("Digite o coeficiente 'a': ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente 'b': ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente 'c': ");
        double c = scanner.nextDouble();

        if (a == 0 && b == 0) {
            if (c != 0) {
                System.out.println("Coeficientes informados incorretamente.");
            } else {
                System.out.println("Equacao trivial: 0 = 0. Infinitas solucoes.");
            }
        } else if (a == 0) {
            System.out.println("Essa e uma equacao de primeiro grau.");
            double raiz = -c / b;
            System.out.println("A raiz real da equacao e: " + raiz);
        } else {
            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Esta equacao nao possui raizes reais.");
            } else if (delta == 0) {
                System.out.println("Esta equacao possui duas raizes reais iguais.");
                double raiz = -b / (2 * a);
                System.out.println("O valor das raizes e: " + raiz);
            } else {
                System.out.println("Esta equacao possui duas raizes reais diferentes.");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("O valor da primeira raiz e: " + x1);
                System.out.println("O valor da segunda raiz e: " + x2);
            }
        }

        scanner.close();
    }
}