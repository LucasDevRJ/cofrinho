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

	@Override
	public double converter() {
		return this.getValor();
	}
}
