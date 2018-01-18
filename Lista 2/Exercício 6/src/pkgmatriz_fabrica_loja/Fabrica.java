package pkgmatriz_fabrica_loja;

public class Fabrica extends Venda {
	
	private int operarios;

	
	public Fabrica(String c, String e,double v,int op) {
		super(c, e, v);
		operarios = op;
	}

	public double calculaFaturmento() {
		return venda *1.5;
	}
	

}
