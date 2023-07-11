package cofrinho;

public abstract class Moeda {

	private String nome;
	private double valor;
	
	public void exibeInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Valor: " + valor);
	}
}
