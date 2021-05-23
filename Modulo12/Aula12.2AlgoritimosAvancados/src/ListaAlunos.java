
public class ListaAlunos {

	static final int QUANTIDADE_LISTA=5;
	
	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];
	int tamanhoLista = 0;
	
	Aluno obter(int indice) {
		return lista[indice];
	}
	
	int tamanho() {
		return tamanhoLista;
	}
	
	void adicionar(Aluno aluno) {
		if(tamanhoLista == lista.length) {
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];
			for(int i=0; i<lista.length; i++) {
				novaLista[i] = lista[i];
			}
			lista = novaLista;
		}
		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}
	
	void remover(Aluno aluno) {
		for(int i=0; i<tamanhoLista; i++) {
			Aluno a = lista[i];
			if(a != null && a.equals(aluno)) {
				remover(i);
				break;
			}else if(a == null && aluno ==  null) {
				remover(i);
				break;
			}
		}
	}
	
	void remover(int indice) {
		int indiceInicial = indice + 1;
		for(int i=indiceInicial; i<tamanhoLista; i++) {
			lista[i - 1] = lista[i];
		}
		tamanhoLista--;
		lista[tamanhoLista] = null;
	}
	
	void ordenar() {
		// {C, D, A, F, G}
		for(int i=1; i<tamanhoLista; i++) {
			Aluno alunoPosicaoBase=lista[i];
			int indicePosicaoBase = i;
			while(indicePosicaoBase > 0) {
				int indicePosicaoAnterior = indicePosicaoBase - 1;
				Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];
				//Aqui ele criou essa vari�vel para melhor entender o if a seguir
				//boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null || alunoPosicaoAnterior.VemDepoisDe(alunoPosicaoBase);
				//Pois se a posi��o anteriror for null, tamb�m queremos jog�-la para frente, afim de lev�-la ao final da lista
				if(alunoPosicaoAnterior == null || alunoPosicaoAnterior.VemDepoisDe(alunoPosicaoBase)) {
					lista[indicePosicaoBase] = lista[indicePosicaoAnterior];
					indicePosicaoBase--;
				}else {
					break;
				}
			}
			lista[indicePosicaoBase] = alunoPosicaoBase;
		}
		
	}
}
