import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
//		
//		Análise de Temperaturas Médias Anuais: Você foi contratado para realizar a 
//		análise das temperaturas médias anuais de uma cidade ao longo dos últimos 10 
//		anos. Os dados são fornecidos em um formato de matriz (array bidimensional), 
//		onde cada linha representa um ano e cada coluna representa um mês (de janeiro a 
//		dezembro). Instruções:
//			a) Crie uma matriz de 10x12 contendo as temperaturas médias mensais de cada 
//			ano (valores fictícios podem ser utilizados para testar o código).
//			b) Calcule a média de cada linha (ano).
//			c) Determine o ano com a maior média e o ano com a menor média
		
		int matrix[][] = new int [10][12];
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int ano, mes;
		double media = 0;
		double [] medianual = new double[matrix.length];
		
		DecimalFormat mascara = new DecimalFormat("#,##0.00");
		
		
		for (ano = 0; ano < matrix[ano].length; ano++) {
			for (mes = 0; mes < matrix[ano].length; mes++) {
				matrix[ano][mes] = (int) rd.nextDouble(5, 36);
				System.out.print(mascara.format(matrix[ano][mes]) + "\t");
				media += matrix[ano][mes];
			}
		} System.out.println();
		
		
		medianual[ano] = media/matrix[ano].length;
		System.out.println();
		
	
		for (double t : medianual) {
			System.out.print(mascara.format(t) + "Media Anual");
		}
	

}
	
}
