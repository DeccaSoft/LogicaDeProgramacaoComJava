package Classe_x_Instancia;

public class Classe_x_Instancia {

	public static void main(String[] args) {

		System.out.println("Quantidade Mínima em Estoque(Classe): " + Produto.qtdMin);
		
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		p1.nome = "Caneca";
		p2.nome = "Carteira";

		p1.qtdMin = 10;	//Está enfatizado por ser variável estática

		System.out.println("Produto 1: " + p1.nome);
		System.out.println("Quantidade Mínima em Estoque(Produto 1): " + p1.qtdMin);
		System.out.println("Produto 2: " + p2.nome);
		System.out.println("Quantidade Mínima em Estoque(Produto 2): " + p2.qtdMin);
		//Ou seja, Uma variável Estática É da Classe,
		//portanto, se for alterada, mesmo em uma instância, continuará alterada...

		System.out.println("Quantidade Mínima em Estoque(Classe): " + Produto.qtdMin);
		//Aprendizado: Em se tratando de variáveis estáticas,
		//APENAS devemos usar a Classe para acessá-las.
		
		//O mesmo vale para Métodos Estáticos
		Impressao.info("Produto Criado com Sucesso!");
		Impressao.erro("Falha na Criação do Produto!");
	}

}
