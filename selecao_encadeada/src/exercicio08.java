import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// converter para a base decimal um número de 4 bits
		
		int u, d, c, m, ent, tot;
		Scanner in = new Scanner(System.in);
				
				System.out.println("Digite um número de 4 bits (0 e 1):    ");
				ent = in.nextInt();
				
				//u = (n / 1000) * 2^0 ;
				//d = (n / 100) * 2^1;
				//c = (n / 10) * 2^2;
				//m = (n / 1) * 2^3;
				
				u = (int) (ent % 10 * Math.pow(2, 0));
				d = (int) (ent % 100 / 10 * Math.pow(2, 1));
				c = (int) (ent / 100 % 10 * Math.pow(2, 2));
				m = (int) (ent / 1000 * Math.pow(2, 3));
				tot = u + d + c + m;
				
				System.out.println("Convertido para número decimal, o resultado de " + ent + " é ---> " + tot);
						
		
	}

}
