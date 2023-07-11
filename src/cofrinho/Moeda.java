package cofrinho;

public abstract class Moeda {

	private int id;
	private String nome;
	private double valor;
	private double valorConvertidoEmReais = 0.0;
	
	//Construtor para forçar a inserção de valores nos atributos
	public Moeda(String nome, double valor) {
		this.id = (int) Math.round(Math.random() * 10000);
		this.nome = nome;
		this.valor = valor;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	//Métodos abstratos para que os filhos sejam obrigados a herdar
	//e aplicar os métodos de forma distinta
	public abstract void exibeInformacoes();
	
	public abstract double converter();
}
