package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	
	public void adicionarMoeda(Moeda moeda) {
		this.moedas.add(moeda);
	}
	
	public void removerMoeda(Moeda moeda) {
		this.moedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		for (Moeda moeda : moedas) {
			System.out.println(moeda);
		}
	}
}
