import java.util.Scanner;


public class exercicio09 {

	public static void main(String[] args) {
		// resolver uma equação de segundo grau
		
		double x, y, sub;

		Scanner in = new Scanner(System.in);

		System.out.println("Entre com o valor de x --> ");

		x = in.nextDouble();
		
		sub = Math.pow(x, 2) / 2;

		y = 1 + Math.pow((Math.pow(x, 4) - 1 / Math.pow(x, 2) * 2), 2) - sub;

		System.out.println("O valor de y é --->" + String.format("%.3f", y));

	}

}
