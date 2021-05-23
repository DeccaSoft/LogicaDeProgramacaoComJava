package EscritaLeituraArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivo {

	public static void main(String[] args) throws IOException {

		Path arquivo = Paths.get("C:\\Users\\andre\\WorkSpaces\\AlgaWorks\\LogicaDeProgramacaoComJava\\Modulo10\\Aula10.2EscritaLeituraArquivo\\src\\arquivo.txt");
		List<String> linhas = Files.readAllLines(arquivo);
		for(int i=0; i<linhas.size(); i++) {
			String linha = linhas.get(i);
			System.out.println("Linha " + (i+1) + " " + linha);
		}

	}

}
