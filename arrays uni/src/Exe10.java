import java.util.Random;

public class Exe10 {

	public static void main(String[] args) {
		//  Escrever um programa em Java que preencha um vetor de 10 posições com valores
		// aleatórios. Em seguida, colocar os valores do vetor em ordem crescente.
		// Imprima no vídeo os elementos do vetor antes e após a ordenação.
		
		// tamanho aleatorio
		Random rd = new Random();
		int[] vetor = new int[rd.nextInt(5,12)];
		int aux = 0;
		
		// armazenar os valores
		System.out.println("antes da ordenacao");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rd.nextInt(10);
			System.out.print(vetor[i] + " ");
		}
		
		// ordem crescente
		for (int j = 0; j < vetor.length; j++) {
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i+1]) {
					aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
				}
			}
				
		}
		
		// impressao
			System.out.println("\ndepois da ordenacao");
			for (int j : vetor) {
				System.out.print(j + " ");
		}
		
		
	}

}
