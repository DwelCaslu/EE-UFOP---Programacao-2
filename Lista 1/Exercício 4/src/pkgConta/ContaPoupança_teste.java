package pkgConta;

public class ContaPoupan�a_teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaPoupan�a c1 = new ContaPoupan�a (1000, 0.5);
		
		c1.obterSaldo();
		c1.depositar(500);
		c1.obterSaldo();
		c1.retirar(300);
		c1.obterSaldo();
		c1.adicionarJuros();
		c1.obterSaldo();
	}

}
