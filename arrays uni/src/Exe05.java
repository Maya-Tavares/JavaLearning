import java.util.Iterator;
import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		// Escreva um programa que leia e armazene 10 números inteiros em um vetor. Em
		// seguida, inverta os elementos inicialmente armazenados. Imprima no terminal os
		// elementos antes e após a inversão.
		
		Scanner in = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int aux = 0, i;
		
		System.out.println("Entre com 5 valores: ");
		for(i = 0; i < vetor.length; i++) {
			vetor[i] = in.nextInt();
		}
		
		for(i = 0; i < vetor.length - 1; i++) {
			for(int j = 0; j < vetor.length; j++) {
				if(i < j) {
					vetor[i] = j;
					j = aux;
					aux = vetor[i];
				}
				System.out.println("Invertido: " + vetor[i]);
			}
		}
		
		
		
	}

}
