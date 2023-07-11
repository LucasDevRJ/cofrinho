package cofrinho;

public class Principal {

	public static void main(String[] args) {
		Dolar dolar = new Dolar("Dólar", 7.20, 4.88);
		dolar.converter();
		dolar.exibeInformacoes();
		
		Euro euro = new Euro("Euro", 5.60, 5.37);
		euro.converter();
		euro.exibeInformacoes();
		
		Real real = new Real("Real", 9.30);
		real.converter();
		real.exibeInformacoes();
		
		Cofrinho cofrinho = new Cofrinho();
		cofrinho.adicionarMoeda(real);
		cofrinho.adicionaValorConvertidoEmReal(real);
		cofrinho.adicionaValorConvertidoEmReal(euro);
		cofrinho.adicionaValorConvertidoEmReal(dolar);
		cofrinho.adicionarMoeda(dolar);
		cofrinho.adicionarMoeda(euro);
	}
}
