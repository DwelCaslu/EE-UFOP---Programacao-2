package pkgPastel;

public class PastelCarne extends Pastel{
	
	public PastelCarne(double imp, double comp){
		super(imp,comp);
	}
	
	public double calculaPreco(){
		return 0.5*impostos + 0.5*compras;
	}

}
