package cofrinho;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	static Cofrinho cofrinho = new Cofrinho();
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		exibeMenuCofrinho();
	}
	
	public static void exibeMenuCofrinho() {
		
		int opcao;
		do {
			System.out.println("-------------------|MENU PRINCIPAL|-------------------");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Total Convertido");
			System.out.println("5 - Sair");
			System.out.println("------------------------------------------------------");
			System.out.print("Digite a opção desejada: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
				case 1:
					exibeMenuMoedas();
				break;
				
				case 2:
					if (!cofrinho.getMoedas().isEmpty()) {
						System.out.print("Digite o valor da moeda que deseja remover: ");
						double valor = entrada.nextDouble();
						
						int tamanhoCofrinho = cofrinho.getMoedas().size();
						for (int i = 0; i < tamanhoCofrinho; i++) {
							double valorMoeda = cofrinho.getMoedas().get(i).getValor();
							if (valor == valorMoeda) {
								Moeda moeda = cofrinho.getMoedas().get(i);
								cofrinho.removerMoeda(moeda);
								System.out.println();
							}
						} 
					} else {
						System.out.println("O cofrinho está vázio!");
					}
				break;
				
				case 3:
					if (!cofrinho.getMoedas().isEmpty()) {
						cofrinho.listagemMoedas();
						System.out.println();
					} else {
						System.out.println("O cofrinho está vázio!");
					}
				break;
				
				case 4:
					cofrinho.totalConvertido();
					System.out.println();
				break;
				
				default:
					System.out.println("Opção inválida!!");
				
			}
		} while (opcao != 5);
	}
	
	public static void exibeMenuMoedas() {
		System.out.println("1 - Dólar");
		System.out.println("2 - Euro");
		System.out.println("3 - Real");
		System.out.println("4 - Voltar");
		System.out.print("Digite a opção desejada: ");
		int opcao = entrada.nextInt();
		
		if (opcao == 1) {
			System.out.print("Digite o valor da cotação do Dólar: ");
			double cotacao;
			
			try {
				cotacao = entrada.nextDouble();
			} catch (InputMismatchException erro) {
				throw new InputMismatchException("Digite somente números!");
			} 
			
			System.out.print("Digite o valor em Dólar: ");
			double valor;
			
			try {
				valor = entrada.nextDouble();
			} catch (InputMismatchException erro) {
				throw new InputMismatchException("Digite somente números!");
			}
			
			Dolar dolar = new Dolar(valor, cotacao);
			cofrinho.adicionarMoeda(dolar);
			System.out.println();
		} else if (opcao == 2) {
			System.out.print("Digite o valor da cotação do Euro: ");
			double cotacao;
			
			try {
				cotacao = entrada.nextDouble();
			} catch (InputMismatchException erro) {
				throw new InputMismatchException("Digite somente números!");
			} 
			
			System.out.print("Digite o valor em Euro: ");
			double valor = entrada.nextDouble();
			
			try {
				valor = entrada.nextDouble();
			} catch (InputMismatchException erro) {
				throw new InputMismatchException("Digite somente números!");
			} 
			
			Euro euro = new Euro(valor, cotacao);

			cofrinho.adicionarMoeda(euro);
			System.out.println();
		} else if (opcao == 3) {
			System.out.print("Digite o valor em Reais: ");
			double valor;
			
			try {
				valor = entrada.nextDouble();
			} catch (InputMismatchException erro) {
				throw new InputMismatchException("Digite somente números!");
			} 
			
			Real real = new Real(valor);
			
			cofrinho.adicionarMoeda(real);
			System.out.println();
		}
		
		exibeMenuCofrinho();
	}
}
