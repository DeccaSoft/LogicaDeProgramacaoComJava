
public class Aluno {

	String nome;
	
	boolean VemDepoisDe(Aluno aluno) {
		if(aluno == null) {
			return false;
		}
		return nome.compareTo(aluno.nome) > 0;
		//compareto() retorna 1 se nome vier depois de aluno.nome
								//0 se forem iguais
								//e -1 se vier antes
	}
}
