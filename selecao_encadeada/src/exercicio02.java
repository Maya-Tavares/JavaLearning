import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

				// $ 250 diaria do hotel 
				// taxas de serviço:
				// $15,5 por d, se d > 15
				// $36 por d, se d = 15
				// $58 por d, se d < 15
		
				int d;
				float taxa, total;
				Scanner in = new Scanner(System.in);
				
				System.out.println("Quantos dias o cliente ficou: ");
				d = (int) in.nextFloat();				
				
				if (d > 15) {
					taxa = (float) (15.5 * d);
					total = taxa + (250 * d);
					System.out.println("Taxa ----> " + taxa);
					System.out.println("Total -----> " + total);
				}
				else if  ( d == 15) {
					taxa = 36 * d;
					total = taxa + (250 * d);
					System.out.println("Taxa ----> " + taxa);
					System.out.println("Total -----> " + total);
				}
				else if(d < 15 && d > 0) {
					taxa = 58 * d;
					total = taxa + (250 * d);
					System.out.println("Taxa ----> " + taxa);
					System.out.println("Total -----> " + total);
				}
				else if (d <= 0) {
					System.out.println("Erro, tente novamente");
				}
				
				
				
				
	}

}
