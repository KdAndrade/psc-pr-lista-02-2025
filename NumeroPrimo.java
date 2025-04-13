
import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = leitura.nextInt();

        if (numero <= 1) {
            System.out.println("O número não é primo.");
        } else {
            boolean ehPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println("O número " + numero + " é primo.");
            } else {
                System.out.println("O número " + numero + " não é primo.");
            }
        }

        leitura.close();
    }
}
