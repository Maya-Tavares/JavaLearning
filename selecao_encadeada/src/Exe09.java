import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		// Escreva um programa em Java que leia e armazene o nome e o salário dos
		// funcionários de uma empresa. Imprima no vídeo o total que a empresa gasta com a
		// folha de pagamento (soma do salário de todos os funcionários) e a média salarial
		// paga aos funcionários.
		
		Scanner in = new Scanner(System.in);
		double total = 0, media = 0;
		int func;
		
		System.out.print("Total de funcionarios: ");
		func = in.nextInt();
		
		String nome[] = new String[func];
		double[] sal = new double[nome.length];
		
		for (int i = 0; i < sal.length; i++) {
			in.nextLine();
			System.out.print("Nome do Funcionario " + (i+1) + " : ");
			nome[i] = in.nextLine();
			System.out.print("Salario do Funcionario " +  (i+1) +  ": ");
			sal[i] = in.nextDouble();
			
			total = total + sal[i];
		}
		
		System.out.println("Total de todos os salarios R$ " + String.format("%.2f", total));
		System.out.println("Media salarial R$ " + String.format("%.2f", total / func ));
		
	}

}
