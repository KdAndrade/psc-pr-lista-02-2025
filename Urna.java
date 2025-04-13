
import java.util.Scanner;

public class Urna {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int voto = 0, candidato1 = 0, candidato2 = 0, candidato3 = 0, nulo = 0, branco = 0;

        System.out.println("1. Candidato Jair Rodrigues\n2. Candidato Carlos Luz\n3. Candidato Neves Rocha\n4. Nulo\n5. Branco\n6. Exibir resultados");

        while (true) {
            System.out.println("Entre com o seu voto (ou digite 0 para encerrar):");
            voto = leitura.nextInt();

            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                    System.out.println("Você votou no candidato Jair Rodrigues.");
                    candidato1++;
                    break;
                case 2:
                    System.out.println("Você votou no candidato Carlos Luz.");
                    candidato2++;
                    break;
                case 3:
                    System.out.println("Você votou no candidato Neves Rocha.");
                    candidato3++;
                    break;
                case 4:
                    System.out.println("Você votou nulo.");
                    nulo++;
                    break;
                case 5:
                    System.out.println("Você votou em branco.");
                    branco++;
                    break;
                case 6:
                    int totalVotos = candidato1 + candidato2 + candidato3 + nulo + branco;

                    double porcentagemNulo = (totalVotos > 0) ? (nulo * 100.0 / totalVotos) : 0;
                    double porcentagemBranco = (totalVotos > 0) ? (branco * 100.0 / totalVotos) : 0;

                    String vencedor;
                    if (candidato1 > candidato2 && candidato1 > candidato3) {
                        vencedor = "Candidato Jair Rodrigues";
                    } else if (candidato2 > candidato1 && candidato2 > candidato3) {
                        vencedor = "Candidato Carlos Luz";
                    } else if (candidato3 > candidato1 && candidato3 > candidato2) {
                        vencedor = "Candidato Neves Rocha";
                    } else {
                        vencedor = "Empate entre os candidatos";
                    }

                    System.out.println("\nResultado da votação:");
                    System.out.println("Total de votos do candidato Jair Rodrigues: " + candidato1);
                    System.out.println("Total de votos do candidato Carlos Luz: " + candidato2);
                    System.out.println("Total de votos do candidato Neves Rocha: " + candidato3);
                    System.out.println("Total de votos nulos: " + nulo + " (" + String.format("%.2f", porcentagemNulo) + "%)");
                    System.out.println("Total de votos em branco: " + branco + " (" + String.format("%.2f", porcentagemBranco) + "%)");
                    System.out.println("Candidato vencedor: " + vencedor);
                    break;
                default:
                    System.out.println("Voto inválido!");
            }
        }

        leitura.close();
    }
}
