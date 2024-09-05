import java.util.Random;

public class exe04 {

	public static void main(String[] args) {
//		Análise de Vendas de Produtos: 
//		Uma loja online vende três categorias de
//		produtos: Eletrônicos, Roupas, e Alimentos. 
//		As vendas desses produtos foram
//		registradas ao longo dos últimos 6 meses. Você deve analisar essas vendas
//		para obter insights sobre o desempenho de cada categoria. Instruções:
//		a) Ler os valores fictícios das vendas.
//		b) Calcular o total de vendas por categoria.
		
//		c) Identificar o mês com o maior número de vendas totais.
//		d) Calcular a média de vendas mensais para cada categoria
		
		Random rd = new Random();
		String[] categoria = { "eletronicos", "roupas", "alimentos"	};
		String[] mes = { "Jan", "Fev", "Mar"};
		int total = 0, media = 0;
		
		int[][] venda = new int[categoria.length][mes.length];
		
		for (int i = 0; i < venda.length; i++) {
			for (int j = 0; j < venda[i].length; j++) {
				venda[i][j] = rd.nextInt(100);
				
				System.out.print(venda[i][j] + "\t");
			}
			System.out.println(categoria[i]);
			System.out.println();
		}
		
		for (int i = 0; i < venda.length; i++) {
			for (int j = 0; j < venda.length; j++) {
				total += venda[i][j];
			}
			System.out.println("categoria: " + categoria[i]);
			System.out.println("total: " + total);
		}
	}

}
