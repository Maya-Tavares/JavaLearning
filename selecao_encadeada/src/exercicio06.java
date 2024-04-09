import java.util.Scanner;



public class exercicio06 {



	public static void main(String[] args) {

		// calcular matematicamente a expressão y

		

		float x, y;

		Scanner in = new Scanner(System.in);

		

		System.out.println("Entre com o valor  de X para descobrir o cálculo:");

		System.out.println("y = 8 / -/ x^2 - 25");

		x = in.nextFloat();

		

		if (x > 5 && x < -5 ) {

			y = (float) (8 / (Math.sqrt(Math.pow(x, 2) - 25)));

			System.out.println("O valor de y é = " + y);

		}

		else {

			System.out.println("O valor de X deve ser > 5 e < -5, por favor tente novamente.");

		}



		

	}



}