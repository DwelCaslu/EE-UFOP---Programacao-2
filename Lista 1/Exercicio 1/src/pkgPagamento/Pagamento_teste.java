package pkgPagamento;

public class Pagamento_teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pagamento p1= new Pagamento("12a","joao",200);
		
		p1.salarioBasico();
		p1.descInss();
		p1.descIr();
		
	}

}
