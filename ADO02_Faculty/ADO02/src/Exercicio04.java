import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("-->CONTADOR DE LETRAS<--");
		System.out.print("Insiria o seu primeiro nome: ");
		String name = sc.next();
		
		int length = name.length();
		
		System.out.println("Seu nome possui " + length + " letras.");
		
		sc.close();
	}
}
