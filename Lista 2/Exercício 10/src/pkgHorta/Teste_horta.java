package pkgHorta;

public class Teste_horta {

	
	public static void main(String[] args) {
		
		Horta h1 = new Horta ("Belmir",3);
		
		h1.insereLegume(new Batata("10/02/2010",2,3,1),new Cenoura("10/02/2010",1,3),new Tomate("10/02/2010",2,2,2));
		h1.insereLegume(new Batata("11/02/2010",3,1,2),new Cenoura("11/02/2010",2,2),new Tomate("11/02/2010",1,1,1));
		h1.insereLegume(new Batata("12/02/2010",1,2,3),new Cenoura("12/02/2010",2,4),new Tomate("12/02/2010",2,3,3));
	
		h1.ConfereMaiorBatata();
		h1.ConfereMaiorCenoura();
		h1.ConfereMaiorTomate();
	
	}

}
