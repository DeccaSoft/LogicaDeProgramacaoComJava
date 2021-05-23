package encapsulamento;

public class Ecapsulamento {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		//Antes do Encapsulamento
		//cliente.nome = "Andr� Morais";
		//cliente.telefone = "99999999";
		
		//Ap�s o Encapsulamento
		//cliente.setNome("Andr�", "Morais");
		cliente.setTelefone("99999999");
		//Mais Avn�ado...
		cliente.setNome("Andr� Morais");
		
		System.out.println("Nome do Cliente: " + cliente.getNome());
		System.out.println("Primeiro do Cliente: " + cliente.getPrimeiroNome());
		System.out.println("�ltimo do Cliente: " + cliente.getUltimoNome());
	}

}
