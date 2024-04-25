import java.util.Scanner;

public class exerciciocase1 {

	public static void main(String[] args) {
		// Escreva um programa em Java que leia um caractere digitado pelo usuário. 
		// Imprima uma mensagem no vídeo informando se o caractere lido é ou não 
		// uma vogal. Você deverá resolver esse exercício usando a estrutura de seleção 
		// if-else
		String ent;
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Entre com uma letra: ");
		ent = tec.next();
		// convertendo para nao fazer o equals.ignore.case nas linhas
		ent = ent.toLowerCase();
		
		switch(ent) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("É uma vogal");
			break;
		default:
			System.out.println("Não é uma vogal");

		}
		
	}

}
