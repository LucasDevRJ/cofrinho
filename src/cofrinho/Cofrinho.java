package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	private double valorConvertidoEmReais = 0.0;
	
	public ArrayList<Moeda> adicionarMoeda(Moeda moeda) {
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
	
	public String totalConvertido() {
		return "O valor total convertido em Reais é R$ " + this.valorConvertidoEmReais;
	}
}
