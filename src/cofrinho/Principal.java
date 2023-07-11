package cofrinho;

public class Principal {

	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho();
		Real real1 = new Real("Real", 4.60);
		cofrinho.adicionarMoeda(real1);
		cofrinho.exibeQuantidadeMoedasNoCofrinho();
	}
}
