
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double saldo = 0.0;
        int caixa;

        while (true) {
            System.out.println("\nCaixa Eletrônico:");
            System.out.println("1. Depósito");
            System.out.println("2. Saque");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            caixa = leitura.nextInt();

            switch (caixa) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = leitura.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso! Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = leitura.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo atual é: " + saldo);
                    break;
                case 4:
                    System.out.println("Saindo do caixa eletrônico. Até logo!");
                    leitura.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
