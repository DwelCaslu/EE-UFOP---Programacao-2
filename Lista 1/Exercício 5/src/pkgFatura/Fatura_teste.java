package pkgFatura;

public class Fatura_teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Fatura p1= new Fatura("01","Feijao",10,25);
     Fatura p2= new Fatura("02","Arroz",8,-28);
     
     p1.GetFaturaTotal(p1);
     p2.GetFaturaTotal(p2);
     	
	}

}
