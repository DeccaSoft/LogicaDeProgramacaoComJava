
public class Matrizes {

	public static void main(String[] args) {
		
		//Faturamento Diário-Mensal
		double[] fatJan = new double[] {1500, 2000, 2500};
		double[] fatFev = new double[] {3000, 3500, 4000};
		double[] fatMar = new double[] {4500, 5000, 5500};
		//Faturamento Mensal-Anual
		double[][] fatAnual = new double[][] {fatJan, fatFev, fatMar};
		//Iterando...
		for(int i=0; i < fatAnual.length; i++) {
			System.out.println("Mês " + (i+1));
			for(int y=0; y < fatAnual[i].length; y++) {
				System.out.println("Dia " + (y+1) + " " + fatAnual[i][y]);
			}
		}
		System.out.println("===============================================");
		//Exercício:
		
		//Repare nos vetores abaixo:
		Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };
		//Os quatro primeiros vetores estão guardando o faturamento diário de cada semana
		//e o último vetor, que é de 2 dimensões, guarda o faturamento mensal separado por semanas.

		//Crie um algoritmo que encontre qual a semana teve o maior faturamento.
		//No final mostre qual foi essa semana e de quanto foi esse faturamento.
		
		Double[] somaFaturamento = new Double[] {0D, 0D, 0D, 0D};
		for(int i=0; i < mes.length; i++) {
			System.out.print("Semana " + (i+1) + " ");
			//Double[] somaFaturamento = new Double[] {0D, 0D, 0D, 0D};
			for(int y=0; y < mes[i].length; y++) {
				somaFaturamento[i] += mes[i][y];
			}
			System.out.println(somaFaturamento[i]);
		}
		Double maior = 0D;
		int melhorSemana;
		if(somaFaturamento[0] > somaFaturamento[1]) {
			maior = somaFaturamento[0];
			melhorSemana = 1;
		}else if(somaFaturamento[1] > somaFaturamento[2]) {
			maior = somaFaturamento[1];
			melhorSemana = 2;
		}else if(somaFaturamento[2] > somaFaturamento[3]) {
			maior = somaFaturamento[2];
			melhorSemana = 3;
		}else {
			maior = somaFaturamento[3];
			melhorSemana = 4;
		}
		System.out.println("Maior Faturamento: " + maior + " que corresponde à Semana " + melhorSemana);
	}

}
