package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Calculo calculo = new Calculo();

		System.out.println("Bem vindo ao Simulado do TACF em Java!");
		System.out.println("Por favor, insira os dados a baixo");
		System.out.print("Sexo (M/F): ");
		char sexo = sc.next().charAt(0);
		calculo.setSexo(sexo);
		
		System.out.print("Quantidade de Flexões de Braço: ");
		int flexao = sc.nextInt();
		calculo.setFlexao(flexao);
		
		System.out.print("Quantidade de abdominais em 1 minuto: ");
		int abdominais = sc.nextInt();
		calculo.setAbdominais(abdominais);
		
		System.out.print("Corrida ou marcha de 12 minutos em metros: ");
		int corrida = sc.nextInt();
		calculo.setCorrida(corrida);
				
		sc.close();
		
		String resultadoFlexao = calculo.ResultadoFlexao(flexao);
		String resultadoAbs = calculo.ResultadoAbs(abdominais);
		String resultadoCorrida = calculo.ResultadoCorrida(corrida);
		String resultadoFinal = calculo.ResultadoFinal(resultadoFlexao, resultadoAbs, resultadoCorrida);
		
		System.out.println();
		System.out.println("RESULTADO: " + resultadoFinal);
		System.out.println("Flexão de Braço: " + resultadoFlexao);
		System.out.println("Abdominais: " + resultadoAbs);
		System.out.println("Corrida: " + resultadoCorrida);
	}
}