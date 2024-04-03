import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		// calcular raizes de segundo grau
		// a^x + bx + c = 0
		
		double a, b, c, delta, div, rq, r1, r2;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Valor de a ==");
		a = in.nextDouble();
		
		System.out.print("Valor de b ==");
		b = in.nextDouble();
		
		System.out.print("Valor de c ==");
		c = in.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		rq = Math.sqrt(delta);
		
		r1 = (-b + rq) / (2 *a);
		r2 = (-b - rq) / (2 *a);
		
		System.out.println("Raíz 1 === " + r1);
		System.out.println("Raíz 2 === " + r2);

	}

}
