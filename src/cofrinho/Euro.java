package cofrinho;

public class Euro extends Moeda{

	//cotação do Euro em relação ao Real para fazer conversão
	private double cotacaoAtual;

	public Euro(double valor, double cotacaoAtual) {
		super(valor);
		this.setNome("Euro");
		this.cotacaoAtual = cotacaoAtual;
	}

	@Override
	public double converter() {
		double conversaoReal = this.getValor() * 5.38;
		System.out.printf("O valor de EUR %.2f convertido em Reais é R$ %.2f\n", this.getValor(), conversaoReal);
		return conversaoReal;
	}
}
