package cofrinho;

public class Real extends Moeda {
	
	public Real(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public void exibeInformacoes() {
		System.out.println("Moeda: " + getNome());
		System.out.println("Valor: R$ " + getValor());
	}

	//Como a ideia do cofrinho é converter moedas estrangeiras 
	//E o Real não é uma, eu simplesmente "converti"
	//O Real para Real, já que ele herda de Moeda
	//É obrigatório que ele tenha os métodos abstratos dela
	@Override
	public double converter() {
		double conversaoReal = this.getValor() * 1;
		System.out.println("O valor R$ " + this.getValor() + " convertido em Reais é R$ " + conversaoReal);
		return conversaoReal;
	}
}
