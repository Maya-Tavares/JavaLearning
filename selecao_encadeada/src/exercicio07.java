import java.util.Scanner;



public class exercicio07 {



	public static void main(String[] args) {

		

		//desconto em função do valor total das compras. Se o total das compras for 

		//if total maior que R$ 1000,00, desconto de 15%

		//else,  desconto de 8%. 

		//imprima no vídeo o valor total e também 

		//o valor economizado com o desconto.

		

		float total, desc, novototal;

		Scanner in = new Scanner(System.in);

		

		System.out.println("Valor total da compra (000.00) ----> ");

		total = in.nextFloat();

		

		if(total > 1000) {

			desc = (float) (total * 0.15);

			novototal = total - desc;

			System.out.println("Valor final = " + novototal);

			System.out.println("Valor descontado = " + desc);

		}

		else {

			desc = (float) (total * 0.08);

			novototal = total - desc;

			System.out.println("Valor final = " + novototal);

			System.out.println("Valor descontado = " + desc);

	

			

		}

		

		

	}



}

