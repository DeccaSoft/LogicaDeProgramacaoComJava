package classes;

public class Produto {
	String nome;
	Double valor;
	Integer quantidade;
	
	public void exibirInformacoes(){
		System.out.println("Exibindo um M�todo de Inst�ncia da Classe Produto...");
		System.out.println("O Produto " + this.nome + " custa R$ " + this.valor + " e tem " + this.quantidade + " unidade(s) em estoque.");
	}
}
