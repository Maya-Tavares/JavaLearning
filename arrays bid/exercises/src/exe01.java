import java.util.Iterator;
import java.util.Random;

public class exe01 {

	public static void main(String[] args) {
		// Escreva um programa em Java que preencha uma matriz quadrada de ordem 4 com
		// valores inteiros aleatórios.
		
		int matrix[][] = new int [4][4];
		int linha, coluna, somadp = 0, somads = 0;
		Random gerador = new Random();
		
		
		for (linha = 0; linha < matrix.length; linha++) {
			for (coluna = 0; coluna < matrix[linha].length; coluna ++) {
				matrix[linha][coluna] = gerador.nextInt(5);
				if(linha == coluna) {
					somadp += matrix[linha][coluna];
				}
				if(linha + coluna == matrix.length-1) {
					somads += matrix[linha][coluna];
				}
			}	
		}
		
		// soma diagonal secundaria
//		for (linha = 0; linha < matrix.length; linha++) {
//			for (coluna = matrix[linha].length; ; coluna --) {
//					somads += matrix[linha][coluna];
//			}	
//		}
		
		// sysout da matrix 
		
		System.out.println();
		for (linha = 0; linha < matrix.length; linha++) {
			for (coluna = 0; coluna < matrix[linha].length; coluna ++) {
				System.out.print(matrix[linha][coluna] + "\t");
			}	
			System.out.println();
		}
		
		System.out.println("Soma DP: " + somadp);
		System.out.println("Soma DS: " + somads);
		
	}

}
