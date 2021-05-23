
public class AlgoritimoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome="André";
		listaAlunos.adicionar(aluno1);
		Aluno aluno2 = new Aluno();
		aluno2.nome="Daniella";
		listaAlunos.adicionar(aluno2);
		Aluno aluno3 = new Aluno();
		aluno3.nome="Mateus";
		listaAlunos.adicionar(aluno3);
		Aluno aluno4 = new Aluno();
		aluno4.nome="Davi";
		listaAlunos.adicionar(aluno4);
		Aluno aluno5 = new Aluno();
		aluno5.nome="Caio";
		listaAlunos.adicionar(aluno5);
		
		//Esse for poderia estar em um método, tendo em vista que se repete lá embaixo

//		for(int i=0; i<listaAlunos.tamanho(); i++) {
//			Aluno a = listaAlunos.obter(i);
//			if(a != null) {
//				System.out.println("Aluno: " + a.nome);
//			}else {
//				System.out.println("Encontrado um Aluno sem Nome = Null");
//			}
//		}
		
		//E assim foi feito...
		iterar(listaAlunos);

		System.out.println("----------Removendo o Aluno 3-----------");
		listaAlunos.remover(aluno4);
		iterar(listaAlunos);
		
//		for(int i=0; i<listaAlunos.tamanho(); i++) {
//			Aluno a = listaAlunos.obter(i);
//			if(a != null) {
//				System.out.println("Aluno: " + a.nome);
//			}else {
//				System.out.println("Encontrado um Aluno sem Nome = Null");
//			}
//		}
		
		System.out.println("----------Ordenando a Lista de Alunos-----------");
		listaAlunos.ordenar();
		iterar(listaAlunos);
	}
	
	static void iterar(ListaAlunos listaAlunos) {
		for(int i=0; i<listaAlunos.tamanho(); i++) {
			Aluno a = listaAlunos.obter(i);
			if(a != null) {
				System.out.println("Aluno: " + a.nome);
			}else {
				System.out.println("Encontrado um Aluno sem Nome = Null");
			}

		}
	}

}
