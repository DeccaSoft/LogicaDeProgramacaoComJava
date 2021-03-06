package EscritaLeituraArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		//linhas.add("Linha 1");
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite o " + (i+1) + "º Nome: ");
			String nome = scanner.nextLine();
			linhas.add(nome);
		}
		
		Path arquivo = Paths.get("C:\\Users\\andre\\WorkSpaces\\AlgaWorks\\LogicaDeProgramacaoComJava\\Modulo10\\Aula10.2EscritaLeituraArquivo\\src\\arquivo.txt");
				
		try {
			Files.write(arquivo, linhas);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		scanner.close();
		System.out.println("Fim...");
	}

}
