package cofrinho;

import java.util.ArrayList;

public class Cofrinho {

	private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		this.moedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		this.moedas.remove(moeda);
	}
}
