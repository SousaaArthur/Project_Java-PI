import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(
            "Acerte o valor da conversão do número binário para decimal: \n" + 
            "1011010100\n" +
            "Qual é a resposta correta?\n" +
            "a) 132\n" + 
            "b) 180\n" +
            "c) 173\n" +
            "d) 150\n" +
            "e) 164\n"
        );

        int tentativas = 0;
        Boolean finalizar = false;

        do {
            System.out.println("Tentativa: " + tentativas   );
            if (tentativas == 3) {
                System.out.println("Você excedeu o número de tentativas permitidas.");
                finalizar = true;
                break;
            }
            System.out.println("Digite a opção correta: ");
            String option = sc.next();
            tentativas++;
            switch (option) {
                case "a":
                    System.out.println("Resposta incorreta! Tente novamente.");
                    break;
                case "b":
                    System.out.println("Resposta incorreta! Tente novamente.");
                    break;
                case "c":
                    System.out.println("Resposta correta! Parabéns!");
                    finalizar = true;
                    break;
                case "d":
                    System.out.println("Resposta incorreta! Tente novamente.");
                    break;
                case "e":
                    System.out.println("Resposta incorreta! Tente novamente.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (finalizar != true);

        sc.close();
    }
}
