import java.util.Scanner;

/* 
Dado um ano com 4 dígitos dizer ser ele é um ano bissexto ou não.
(Lembre-se que um ano é bissexto se ele for divisível por 400
ou se ele for divisível por 4 e não por 100.)
*/
public class Exercicio03 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira um ano: ");
    int year = sc.nextInt();

    if(year % 4 == 0){
      System.out.println(year + " é um ano bissexto.");
    } else {
      System.out.println(year + " não é um ano bissexto.");
    }

    sc.close();
  }
}
