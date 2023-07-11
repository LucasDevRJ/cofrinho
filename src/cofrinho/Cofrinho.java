package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	private double valorConvertidoEmReais = 0.0;
	
	public ArrayList<Moeda> adicionarMoeda(Moeda moeda) {
		System.out.println("A moeda " + moeda.getNome() + " com o valor de " + moeda.getValor() + " foi adicionada com sucesso!");
		this.moedas.add(moeda);
		adicionaValorASerConvertido(moeda);
		return this.moedas;
	}
	
	private double adicionaValorASerConvertido(Moeda moeda) {
		return this.valorConvertidoEmReais += moeda.getValor();
	}
	
	public ArrayList<Moeda> removerMoeda(Moeda moeda) {
		this.valorConvertidoEmReais -= moeda.getValor();
		this.moedas.remove(moeda);
		return moedas;
	}
	
	public void listagemMoedas() {
		for (Moeda moeda : moedas) {
			moeda.exibeInformacoes();
		}
	}
	
	public void totalConvertido() {
		System.out.println("O valor total convertido em Reais é R$ " + this.valorConvertidoEmReais);
	}
	
	public void exibeQuantidadeMoedasNoCofrinho() {
		System.out.println("Quantidade de Moedas: " + this.moedas.size());
	}
}
