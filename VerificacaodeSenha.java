
import java.util.Scanner;

public class VerificacaodeSenha {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String senhaCorreta = "12345678";
        String senha = "";

        System.out.println("Digite a senha: ");
        senha = leitura.nextLine();

        if (senha.length() < 8 || senha.length() > 12) {
            System.out.println("A senha deve ter entre 8 e 12 caracteres.");
        } else {
            System.out.println("Senha válida!");
        }

        if (senha.equals(senhaCorreta)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }
        while (!senha.equals(senhaCorreta)) {
            System.out.println("Digite a senha: ");
            senha = leitura.nextLine();

            if (senha.equals(senhaCorreta)) {
                System.out.println("Senha correta!");
            } else {
                System.out.println("Senha incorreta!");
            }
        }
        leitura.close();
    }
}
