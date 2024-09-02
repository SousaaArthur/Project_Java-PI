import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o primerio valor: ");
		double value01 = sc.nextDouble();
		
		System.out.print("Insra o segundo valor: ");
		double value02 = sc.nextDouble();
		
		System.out.print("Insira o terceiro valor: ");
		double value03 = sc.nextDouble();
		
		double result = (value01 * value02 * value03);
		
		System.out.println("O valor dos produtos é de: " + result);
		
		sc.close();
		
	}
}
