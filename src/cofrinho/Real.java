package cofrinho;

public class Real extends Moeda {

	public Real(double valor) {
		super(valor);
		this.setNome("Real");
	}

	//Como a ideia do cofrinho é converter moedas estrangeiras 
	//E o Real não é uma, eu simplesmente "converti"
	//O Real para Real, já que ele herda de Moeda
	//É obrigatório que ele tenha os métodos abstratos dela
	@Override
	public double converter() {
		return this.getValor() * 1;
	}
}
