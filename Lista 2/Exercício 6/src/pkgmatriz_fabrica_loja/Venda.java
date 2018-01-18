package pkgmatriz_fabrica_loja;

abstract public class Venda {
	
	protected String cgc;
	protected String endereco; 
	protected double venda;
	
	public double getVenda() {
		return venda;
	}
	public void setVenda(double venda) {
		this.venda = venda;
	}
	public Venda(String c,String e,double v){
		cgc = c;
		endereco = e;
		venda = v;
	}
	abstract public double calculaFaturmento(); 

}
