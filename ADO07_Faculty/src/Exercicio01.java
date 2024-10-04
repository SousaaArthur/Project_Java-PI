import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean finalizar = false;

        ArrayList<String> alternativas = new ArrayList<>();


        System.out.println(
            "Qual das alternativas representa um exemplo de laço de repetição em Java\n" + 
            "Qual é a resposta correta?\n"
        );
        alternativas.add("A) if (condição) {}");
        alternativas.add("B) switch (variável) {}");
        alternativas.add("C) else if(condição){}");
        alternativas.add("D) case '1': break:");
        alternativas.add("E) while (condição) {}");

        do {
            Collections.shuffle(alternativas);

            for(String alternativa : alternativas){
                System.out.println(alternativa);
            }

            System.out.print("Digite a opção correta: ");
            String option = sc.next();
            switch (option) {
                case "A":
                case "a":
                System.out.println("Resposta incorreta! Tente novamente.");
                break;
                case "B":
                case "b":
                System.out.println("Resposta incorreta! Tente novamente.");
                break;
                case "C":
                case "c":
                System.out.println("Resposta incorreta! Tente novamente.");
                break;
                case "D":
                case "d":
                System.out.println("Resposta incorreta! Tente novamente.");
                break;
                case "E":
                case "e":
                System.out.println("Resposta correta! Parabéns!");
                finalizar = true;
                break;
                default:
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (finalizar != true);

        sc.close();
    }
}
