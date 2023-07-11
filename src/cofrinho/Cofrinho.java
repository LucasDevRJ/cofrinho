package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	//atributo acumulador de conversões
	private double valorConvertidoEmReais = 0.0;
	
	public void adicionarMoeda(Moeda moeda) {
		System.out.println("Moeda adicionada com sucesso!");
		this.moedas.add(moeda);
		this.valorConvertidoEmReais += moeda.converter();
	}
	
	public void removerMoeda(Moeda moeda) {
		//System.out.println("A moeda com o ID " + moeda.getId() + " foi removida com sucesso!!");
		this.moedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		for (Moeda moeda : moedas) {
			moeda.exibeInformacoes();
		}
	}
	
	public void totalConvertido() {
		System.out.printf("O valor total convertido em Reais é R$ %.2f" , this.valorConvertidoEmReais);
	}
	
	public void exibeQuantidadeMoedasNoCofrinho() {
		System.out.println("Quantidade de Moedas: " + this.moedas.size());
	}
}
