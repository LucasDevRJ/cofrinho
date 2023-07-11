package cofrinho;

public abstract class Moeda {

	private String nome;
	private double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract void exibeInformacoes();
	
	public abstract double converter();
}
