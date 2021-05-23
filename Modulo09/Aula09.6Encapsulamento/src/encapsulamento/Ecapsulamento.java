package encapsulamento;

public class Ecapsulamento {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		//Antes do Encapsulamento
		//cliente.nome = "André Morais";
		//cliente.telefone = "99999999";
		
		//Após o Encapsulamento
		//cliente.setNome("André", "Morais");
		cliente.setTelefone("99999999");
		//Mais Avançado...
		cliente.setNome("André Morais");
		
		System.out.println("Nome do Cliente: " + cliente.getNome());
		System.out.println("Primeiro Nome do Cliente: " + cliente.getPrimeiroNome());
		System.out.println("Último Nome do Cliente: " + cliente.getUltimoNome());
	}

}
