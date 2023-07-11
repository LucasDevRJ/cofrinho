package cofrinho;

public class Euro extends Moeda{
	
	private double cotacaoAtual;

	public Euro(String nome, double valor, double cotacaoAtual) {
		super(nome, valor);
		this.cotacaoAtual = cotacaoAtual;
	}

	@Override
	public double converter() {
		double conversaoReal = this.getValor() * 5.38;
		System.out.printf("O valor de EUR %.2f convertido em Reais é R$ %.2f\n", this.getValor(), conversaoReal);
		return conversaoReal;
	}
	
	@Override
	public void exibeInformacoes() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Valor: EUR " + this.getValor());
		System.out.println("Cotação: " + this.cotacaoAtual);
	}

}
