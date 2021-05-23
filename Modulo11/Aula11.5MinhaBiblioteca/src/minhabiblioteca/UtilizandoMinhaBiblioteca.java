package minhabiblioteca;

import bibliotecaconsole.Console;

public class UtilizandoMinhaBiblioteca {

	public static void main(String[] args) {

		Console teclado = new Console();
		
		Integer inteiro = teclado.lerInteiro("Digite um Número Inteiro: ");
		Double decimal = teclado.lerDecimal("Digite um Número Decimal: ");
		String texto = teclado.lerString("Digite um Texto: ");
		teclado.imprimir(inteiro.toString());
		teclado.imprimir(decimal.toString());
		teclado.imprimir(texto);
		teclado.erro("Você não fechou o Scanner!!!");
		teclado.imprimir("Por favor, feche o Scanner...");
		teclado.fechar();
		teclado.imprimir("Agora sim... Scanner fechado!!!");
		

	}

}
