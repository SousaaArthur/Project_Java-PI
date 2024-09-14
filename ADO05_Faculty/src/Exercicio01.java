import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String menu;

    do{

      System.out.println(
        "Menu Interativo" + 
        "\n1. Instruções" + 
        "\n2. Jogar" + 
        "\n3. Creditos" +
        "\n4. Sair"
      );
      System.out.print("Escolha uma opção: ");

      menu = sc.next();

      switch (menu) {
        case "1":
          System.out.println("Mostrando Instruções...");
          break;
        case "2":
          System.out.println("Iniciando o jogo...");
          break;
        case "3":
          System.out.println("Mostrando os Creditos...");
          break;
        case "4":
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção Invalida!!!");
          break;
      }
    } while(!menu.equals("4"));

    sc.close();
  }
}
