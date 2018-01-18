package pkgmatriz_fabrica_loja;

public class Loja extends Venda {
	
	private int vendedores;

    public Loja(String c, String e,double v,int ve) {
		super(c, e, v);
		vendedores = ve;
	}

	public double calculaFaturmento() {
		return venda*1.75;
	}

}
