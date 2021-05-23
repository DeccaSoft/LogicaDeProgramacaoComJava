package classes;

public class Produto {
	String nome;
	Double valor;
	Integer quantidade;
	
	public void exibirInformacoes(){
		System.out.println("Exibindo um Método de Instância da Classe Produto...");
		System.out.println("O Produto " + this.nome + " custa R$ " + this.valor + " e tem " + this.quantidade + " unidade(s) em estoque.");
	}
}
