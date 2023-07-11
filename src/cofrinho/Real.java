package cofrinho;

public class Real extends Moeda {
	
	public Real(double valor) {
		super(valor);
	}

	@Override
	public void exibeInformacoes() {
		System.out.println("Moeda: Real");
		System.out.println("Valor: R$ " + getValor());
	}

	@Override
	public double converter() {
		return this.getValor();
	}
}
