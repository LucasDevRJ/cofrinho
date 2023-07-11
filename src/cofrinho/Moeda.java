package cofrinho;

public abstract class Moeda {

	private String nome;
	private double valor;

	//Construtor para forçar a inserção de valores nos atributos
	public Moeda(double valor) {
		if (valor <= 0.0) {
			throw new IllegalArgumentException("Insira um valor maior que 0!");
		}
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void exibeInformacoes() {
		System.out.println("Moeda: " + this.nome);
		System.out.println("Valor: " + this.valor);
	}
	
	//Métodos abstratos para que os filhos sejam obrigados a herdar
	//e aplicar os métodos de forma distinta
	public abstract double converter();
}
