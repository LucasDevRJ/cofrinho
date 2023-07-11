package cofrinho;

public class Dolar extends Moeda {
	
	private double cotacaoAtual;
	
	public Dolar(String nome, double valor, double cotacaoAtual) {
		super(nome, valor);
		this.cotacaoAtual = cotacaoAtual;
	}

	@Override
	public double converter() {
		double conversaoReal = this.getValor() * 4.90;
		System.out.println("O valor US " + this.getValor() + " convertido em Reais é R$ " + conversaoReal);
		return conversaoReal;
	}

	@Override
	public void exibeInformacoes() {
		System.out.println("ID: " + getId());
		System.out.println("Nome: " + this.getNome());
		System.out.println("Valor: US " + this.getValor());
		System.out.println("Cotação: " + this.cotacaoAtual);
	}

}
