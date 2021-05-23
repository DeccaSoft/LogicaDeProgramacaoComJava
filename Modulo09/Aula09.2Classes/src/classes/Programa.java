package classes;

public class Programa {

	public static void main(String[] args) {
		Produto prod = new Produto();
		prod.nome = "Smatfone";
		prod.quantidade = 15;
		prod.valor = 500.00;
		
		exibirProduto(prod);
		//Aten��o: O m�todo de cime e o de baixo fazem a mesma coisa.
		System.out.println("--- O ideal seria utilizar um m�todo de inst�ncia... ---");
		prod.exibirInformacoes();

	}

	static void exibirProduto(Produto p) {
		System.out.println("O Produto " + p.nome + " custa R$ " + p.valor + " e tem " + p.quantidade + " unidade(s) em estoque.");
	}
}
