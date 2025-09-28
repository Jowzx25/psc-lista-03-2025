/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Maquinadevenda
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        
        if (valorPago < valorCompra) {
            System.out.println("\nA quantia paga é insuficiente para realizar a compra.");
        } else {
            
            double troco = valorPago - valorCompra;
            System.out.printf("\nTroco: R$ %.2f\n", troco);

            
            double trocoEmCentavos =(troco*100);

            int notas50 = 0;
            int notas20 = 0;
            int notas10 = 0;
            int notas5 = 0;
            int notas2 = 0;
            int notas1 = 0;

        
            while (trocoEmCentavos >= 5000) {
                trocoEmCentavos -= 5000;
                notas50++;
            }
            while (trocoEmCentavos >= 2000) {
                trocoEmCentavos -= 2000;
                notas20++;
            }
            while (trocoEmCentavos >= 1000) {
                trocoEmCentavos -= 1000;
                notas10++;
            }
            while (trocoEmCentavos >= 500) {
                trocoEmCentavos -= 500;
                notas5++;
            }
            while (trocoEmCentavos >= 200) {
                trocoEmCentavos -= 200;
                notas2++;
            }
            while (trocoEmCentavos >= 100) {
                trocoEmCentavos -= 100;
                notas1++;
            }

            // 4. Exibição dos Resultados
            System.out.println("\nNotas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);
        }

        scanner.close();
    }
}

