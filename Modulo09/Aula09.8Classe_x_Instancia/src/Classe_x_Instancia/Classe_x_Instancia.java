package Classe_x_Instancia;

public class Classe_x_Instancia {

	public static void main(String[] args) {

		System.out.println("Qauntidade M�nima em Estoque(Classe): " + Produto.qtdMin);
		
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		p1.nome = "Caneca";
		p2.nome = "Carteira";
		p1.qtdMin = 10;
		System.out.println("Produto 1: " + p1.nome);
		System.out.println("Qauntidade M�nima em Estoque(Produto 1): " + p1.qtdMin);
		System.out.println("Produto 2: " + p2.nome);
		System.out.println("Qauntidade M�nima em Estoque(Produto 2): " + p2.qtdMin);
		//Ou seja, Uma vari�vel Est�tica � da Classe,
		//portanto se for alterada, mesmo em uma inst�ncia, continuar� alterada...
		System.out.println("Qauntidade M�nima em Estoque(Classe): " + Produto.qtdMin);
		//Aprendizado: Em se tratando de vari�veis est�ticas,
		//APENAS devemos usar a Classe para acess�las.
		
		//O mesmo vale para m�todos est�ticos
		Impressao.info("Produto Criado com Sucesso!");
		Impressao.erro("Falha na Cria��o do Produto!");
	}

}
