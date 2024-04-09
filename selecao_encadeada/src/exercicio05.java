import java.util.Scanner;

public class exercicio05 {
	public static void main(String[] args) {

		// verificar se é um triângulo

		float l1, l2, l3, soma;

		Scanner in = new Scanner(System.in);

		

		System.out.println("Digite o primeiro lado do triângulo --->");

		l1 = in.nextFloat();

		

		System.out.println("Digite o segundo lado do triângulo --->");

		l2 = in.nextFloat();

		

		System.out.println("Digite o terceiro lado do triângulo --->");

		l3 = in.nextFloat();

		

		if ((l1 + l2 > l3) && (l2 + l3 > l1) && (l3 + l1 > l2)) {

			System.out.println("É um triângulo!!!!");

		}

		else {

			System.out.println("Não é um triângulo :(");

		}

	}
}
