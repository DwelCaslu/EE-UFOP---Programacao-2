package pkgmatriz_fabrica_loja;

public class Matriz extends Venda {
	
	private String quimico;

	public Matriz(String c, String e,double v,String q) {
		super(c, e, v);
		quimico = q;
	}
	
	public double calculaFaturmento(){
		 return venda *1.5; 
	}

}
