package pkgPastel;

abstract public class Pastel {

	protected double impostos , compras;
	
	public Pastel(double imp, double comp){
		impostos = imp;
		compras = comp;
	}

	public double getImpostos() {
		return impostos;
	}

	public void setImpostos(double impostos) {
		this.impostos = impostos;
	}

	public double getCompras() {
		return compras;
	}

	public void setCompras(double compras) {
		this.compras = compras;
	}
	
	abstract public double calculaPreco();
}
