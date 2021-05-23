package encapsulamento;

public class Cliente {
	
	String telefone;
	//private String nome;
	
	//Foram mudados os requisitos...
	String primeiroNome;
	String ultimoNome;
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return primeiroNome + " " + ultimoNome;
	}
//	public void setNome(String primeiroNome, String ultimoNome) {
//		this.primeiroNome = primeiroNome;
//		this.ultimoNome = ultimoNome;
//	}
	
	//Método mais Avançado...
	void setNome(String nome) {
		String[] nomeCompleto = nome.split(" ");
		primeiroNome = nomeCompleto[0];
		ultimoNome = nomeCompleto[1];
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	
	
}
