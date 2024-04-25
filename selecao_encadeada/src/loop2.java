import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class loop2 {
	
	public static void main(String[] args) {
			// continuar o programa enquanto entrada for diferente de x
			
			int n1, n2, impar;
			Scanner in = new Scanner(System.in);
			
			do {
				System.out.println("Digite um número impar");
				n1 = in.nextInt();
			} while(n1 %2 ==0);
			
}
}
