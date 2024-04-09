import java.util.Scanner;

public class exercicio01 {
public static void main(String[] args) {



		
	// calcular média para 2 provas e 3 trabalhos com pesos diferentes


		float p1, p2, t1, t2, t3, media;	

		float tolerancia = Float.MAX_VALUE;

		

		Scanner in = new Scanner(System.in);



	

		System.out.println("Qual a nota da Prova 1?    ");

		p1 = in.nextFloat();

	

		System.out.println("Qual a nota da Prova 2?    ");

		p2 = in.nextFloat();



		System.out.println("Qual a nota do Trabalho 1?    ");

		t1 = in.nextFloat();



		System.out.println("Qual a nota do Trabalho 2?   ");

		t2 = in.nextFloat();



		System.out.println("Qual a nota do Trabalho 3?   ");

		t3 = in.nextFloat();



		media = (float) (((p1 + p2)/2) * 0.7 + ((t1 + t2 + t3)/3) * 0.3);



		if(media >= 6 - tolerancia ) {



			System.out.println("Parabéns, Aluno Aprovado!!");

			System.out.println("Sua média foi de ----> " + media);



		}



		else {



			System.out.println("Que pena, Aluno Reprovado!!");

			System.out.println("Sua média foi de ----> " + media);



		}



	

	}




}
