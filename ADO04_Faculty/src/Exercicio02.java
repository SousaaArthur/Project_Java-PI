import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(
      "O que é um valor boolean?" +
      "\nA. Números Inteiros" +
      "\nB. Números Reais" +
      "\nC. Cadeia de Caracteres" +
      "\nD. Valores Verdaeiro ou Falso" +
      "\nE. Caracter" +
      "\nESCOLHA A ALTERNATIVA CORRETA"
    );

    System.out.print("Digite sua resposta: ");
    String textBox = sc.next();

    switch (textBox) {
      case "A":
        System.out.println("Você perdeu! Resposta invalida!!!");
        break;
      case "B":
        System.out.println("Você perdeu! Resposta invalida!!!");
        break;
      case "C": 
        System.out.println("Você perdeu! Resposta invalida!!!");
        break;
      case "D": 
        System.out.println("Você venceu! Resposta correta!!!");
        break;
      case "E": 
        System.out.println("Você perdeu! Resposta invalida!!!");
      break;
      default:
        break;
    }

    sc.close();
  }
}
