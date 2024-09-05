import java.util.Random;
import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		
//		Faça um programa em Java que leia uma matriz C2x3. Gere e imprima a matriz
//		transposta Ct
//		A matriz transposta é gerada trocando os elementos da linha pela
//		coluna.
		
		Scanner sc = new Scanner(System.in);
		int linha, coluna;
		Random rd = new Random();
		
		System.out.println("total de linhas: ");
		linha = sc.nextInt();
		
		System.out.println("total de colunas: ");
		coluna = sc.nextInt();
		
		int [][] c = new int[linha][coluna];
		int[][] ct = new int[coluna][linha];
		
		for (int i = 0; i < linha; i++) {
			for (int j = 0; j < coluna; j++) {
				c[i][j] = rd.nextInt(20);
				System.out.print(c[i][j] + "\t");
				ct[j][i] = c[i][j];
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i < coluna; i++) {
			for (int j = 0; j < linha; j++) {
				System.out.print(ct[i][j] + "\t");
			}
			System.out.println();
		}
	} 
	
	

}
