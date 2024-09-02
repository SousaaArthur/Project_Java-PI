/*
Uma loja oferece para seus clientes um desconto de acordo com o valor da
compra. Este desconto é de 20% se o valor da compra for maior ou igual a R$
300,00 e 15% se for menor. Dado o valor do produto, mostre o valor (descontado)
da compra do cliente e o valor do desconto obtido;
*/

import java.util.Scanner;

public class Exercicio01 {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.print("Insira o valor da compra: ");
      Double value = sc.nextDouble();
      
      double discount, finalPrice;
      
      if(value >= 300.00){
        discount = value * 0.20;
        finalPrice = value - discount;
        System.out.println("O valor final da compra é de: " + finalPrice + "R$");
      } else{
        discount = value * 0.15;
        finalPrice = value - discount;
        System.out.println("O valor final da compra é de: " + finalPrice + "R$");
      }

      sc.close();
  }
}
