import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		// Ler três valores inteiros
		// se diferentes, imprimir menor valor
		// se não, informar
		
		int a, b,c ;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro ---->  ");
		a = in.nextInt();
		System.out.println("Digite outro valor inteiro ---->  ");
		b = in.nextInt();
		System.out.println("Digite mais um valor inteiro ---->  ");
		c = in.nextInt();
		
		
		if (a == b || a == c || b == c) {
			System.out.println("Números iguais, tente novamente!");
		}
		if (a < b && a < c) {
			System.out.println("O menor número é " + a);
		}
		else if (b < a && b < c) {
			System.out.println("O menor número é " + b);
		}
		else if (c < a && c < b) {
			System.out.println("O menor número é " + c);
		}
		
		
		
		
	}

}
