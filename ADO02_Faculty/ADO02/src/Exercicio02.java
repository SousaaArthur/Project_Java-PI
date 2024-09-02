import java.util.Scanner;

public class Exercicio02 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-->CONTADOR DE MULTIPLOS<--");
		System.out.print("Insira um valor: ");
		int number = sc.nextInt();
		
		System.out.println("Os três multiplos de " + number + " é: " + (number * 1) + ", " + (number * 2) + " e " + (number * 3));
		
		sc.close();		
	}
}
