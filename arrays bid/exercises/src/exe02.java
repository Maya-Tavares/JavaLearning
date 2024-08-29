import java.util.Random;

public class exe02 {

	public static void main(String[] args) {
		//Escreva um programa em Java que preencha uma matriz D10x10 com valores 
//		aleatórios entre 0 e 1000. Imprima o maior valor armazenado bem como a sua 
//		localização (linha e coluna). Observação: caso o maior valor se repetida dentro da 
//		matriz, todas as localizações deverão ser impressas

			Random rd = new Random();
			int [][] matrix = new int [10][10];
			int l, c, maior = 0;
	
			for (l = 0; l < matrix.length; l++) {
				for (c = 0; c < matrix.length; c++) {
					matrix[l][c] = rd.nextInt(1000);
					System.out.print(matrix[l][c] + "\t");
					if (matrix[l][c] > maior) {
						maior = matrix[l][c];
					}
					
				} System.out.println();
				
			}
			
			for (l = 0; l < matrix.length; l++) {
				for (c = 0; c < matrix.length; c++) {
					if (matrix[l][c] == maior) {
						System.out.println("[" + (l +1) + ", " + (c+1) + "]");
					}
			}
					
		}
	}

}
