import java.util.Scanner;

public class exerciciocase2 {

	public static void main(String[] args) {
		// Escreva um programa em Java que leia um caractere digitado pelo usuário. 
		// Imprima uma mensagem no vídeo informando se o caractere lido é ou não par

		
		int num, div;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		num = tec.nextInt();
		
		div = num%2;
		
		switch(div) {
		case 0:
			System.out.println("É PAR");
			break;
		default:
			System.out.println("É IMPAR");

		}
		
	}

}
