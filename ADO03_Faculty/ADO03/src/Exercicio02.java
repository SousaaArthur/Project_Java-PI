import java.util.Scanner;

/*
Dados 3 valores (possíveis lados) verificar se eles formam um triângulo,
e em caso positivo, dizer se é equilátero, isósceles ou escaleno.
 */
public class Exercicio02 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Insira valor de A em decimal: ");
    int valueA = sc.nextInt();
    System.out.print("Insira valor de B em decimal: ");
    int valueB = sc.nextInt();
    System.out.print("Insira valor de C em decimal: ");
    int valueC = sc.nextInt();



    if(valueA + valueB > valueC){
      if(valueA == valueB && valueB == valueC){
        System.out.println("É um triangulo equilátero");
      } else if (valueA == valueB || valueA == valueC || valueB == valueC){
        System.out.println("É um triangulo isósceles");
      } else if (valueA != valueB && valueB != valueC){
        System.out.println("É um triangulo escaleno");
      }
    } else if (valueA + valueC > valueB){
      if(valueA == valueB && valueB == valueC){
        System.out.println("É um triangulo equilátero");
      } else if (valueA == valueB || valueA == valueC || valueB == valueC){
        System.out.println("É um triangulo isósceles");
      } else if (valueA != valueB && valueB != valueC){
        System.out.println("É um triangulo escaleno");
      }
    } else if (valueB + valueC > valueA){
      if(valueA == valueB && valueB == valueC){
        System.out.println("É um triangulo equilátero");
      } else if (valueA == valueB || valueA == valueC || valueB == valueC){
        System.out.println("É um triangulo isósceles");
      } else if (valueA != valueB && valueB != valueC){
        System.out.println("É um triangulo escaleno");
      }
    } else {
      System.out.println("A área A, B e C, não formam um triangulo!");
    }


    sc.close();
  }
}
