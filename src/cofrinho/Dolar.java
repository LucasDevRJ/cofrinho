package cofrinho;

public class Dolar extends Moeda {

	//cotação do Dólar em relação ao Real para fazer conversão
	private double cotacaoAtual;
	
	public Dolar(double valor, double cotacaoAtual) {
		super(valor);
		this.setNome("Dólar");
		if (cotacaoAtual < 0.0) {
			throw new IllegalArgumentException("Insira um valor maior que 0!");
		}
		this.cotacaoAtual = cotacaoAtual;
	}
	
	@Override
	public double converter() {
		double conversaoReal = this.getValor() * 4.90;
		System.out.printf("O valor US %.2f convertido para Real é R$ %.2f\n", this.getValor(), conversaoReal);
		return conversaoReal;
	}
}
