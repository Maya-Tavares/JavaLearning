import java.util.Scanner;

public class loop01 {

	public static void main(String[] args) {
		// apresentando while - estrutura de repetição
		// ler dois valores. mostrar os impmares entre eles
		
		int n1, n2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor (menor): ");
		n1 = in.nextInt();
		
		System.out.println("Entre com o segundo valor (maior): ");
		n2 = in.nextInt();
		
		if(n2 < n1) {
			System.out.println("Os números precisam ser inteiros e o primeiro deve ser *MENOR* que o segundo");
		}
		else {
			while (n1 <= n2) {
				if (n1 % 2 == 1) {
					System.out.println(n1);
				}
				n1=  n1 +1;
				
			}
		}
	}

}
