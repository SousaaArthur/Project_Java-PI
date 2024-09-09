import java.util.Scanner;

/*
 * Utilizando a instrução switch escreva um programa que recebe um valor inteiro de
 * 1 a 7 e retorna o correspondente dia da semana. Considere que 1 corresponde a
 * domingo, 2 a segunda-feira, ..., 7 a sábado. Além disso, no caso de uma entrada
 * errada, como por exemplo 0, deve ser impresso “Valor inválido!”;
 */
public class Exercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Insira um número de 1 a 7!");
    System.out.print("Digite aqui: ");
    int num = sc.nextInt();

    switch (num) {
      case 1:
        System.out.println("1 é correspondente a Domingo.");
        break;
      case 2: 
        System.out.println("2 é correspondente a Segunda.");
        break;
      case 3: 
        System.out.println("3 é correspondente a Terça.");
        break;
      case 4: 
        System.out.println("4 é correspondente a Quarta.");
        break;
      case 5: 
        System.out.println("5 é correspondente a Quinta.");
        break;
      case 6: 
        System.out.println("6 é correspondente a Sexta.");
        break;
      case 7: 
        System.out.println("2 é correspondente a Sábado.");
        break;
      default:
        System.out.println("Valor inválido!!!");
        break;
    }

    sc.close();
  }
}
