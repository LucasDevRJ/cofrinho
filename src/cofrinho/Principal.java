package cofrinho;

import java.util.Scanner;

public class Principal {
	
	public static Scanner entrada = new Scanner(System.in);
	

	public static void main(String[] args) {
		exibeMenuCofrinho();
	}
	
	public static void exibeMenuCofrinho() {
		int opcao;
		do {
			System.out.println("-------------------|MENU PRINCIPAL|-------------------");
			System.out.println("1 - Adicionar Moeda");
			System.out.print("Digite a opção desejada: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				exibeMenuMoedas();
			}
		} while (opcao != 5);
	}
	
	public static void exibeMenuMoedas() {
		System.out.println("1 - Dólar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			System.out.print("Digite o valor da cotação do Dólar: ");
			double cotacao = entrada.nextDouble();
			
			System.out.print("Digite o valor em Dólar: ");
			double valor = entrada.nextDouble();
			
			Dolar dolar = new Dolar(valor, cotacao);
			Cofrinho cofrinho = new Cofrinho();
			cofrinho.adicionarMoeda(dolar);
		} else if (opcao == 2) {
			System.out.print("Digite o valor da cotação do Euro: ");
			double cotacao = entrada.nextDouble();
			
			System.out.print("Digite o valor em Euro: ");
			double valor = entrada.nextDouble();
			
			Euro euro = new Euro(valor, cotacao);
			Cofrinho cofrinho = new Cofrinho();
			cofrinho.adicionarMoeda(euro);
		}
		
		exibeMenuCofrinho();
	}
}
