package pkgPastel;

public class PastelQueijo extends Pastel {
	
	public PastelQueijo(double imp, double comp){
		super(imp,comp);
	}
	
	public double calculaPreco(){
		return 0.4*impostos+0.6*compras;
	}

}
