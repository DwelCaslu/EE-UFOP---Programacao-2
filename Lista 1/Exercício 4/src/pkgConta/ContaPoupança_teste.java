package pkgConta;

public class ContaPoupanša_teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaPoupanša c1 = new ContaPoupanša (1000, 0.5);
		
		c1.obterSaldo();
		c1.depositar(500);
		c1.obterSaldo();
		c1.retirar(300);
		c1.obterSaldo();
		c1.adicionarJuros();
		c1.obterSaldo();
	}

}
