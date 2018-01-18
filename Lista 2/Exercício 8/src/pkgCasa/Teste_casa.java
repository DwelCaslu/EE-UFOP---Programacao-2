package pkgCasa;

public class Teste_casa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casa_A c1 = new Casa_A(1,1,2,1,"piso: Ardósia, tomadas : 5","piso até o teto: sim, tomadas: 4","guarda roupa embutido: sim, tomadas:2","bidê: sim, tomadas: 1","guarda roupa embutido: não, tomadas:3");
		Casa_B c2 = new Casa_B(1,1,3,2,"piso: azulejo, tomadas: 4","piso até o teto: não, tomadas: 2","guarda roupa embutido: não, tomadas:3","bidê: não, tomadas: 2","guarda roupa embutido: não, tomadas:2","guarda roupa embutido: sim, tomadas:1","bidê: sim, tomadas: 3","10m² de quintal");
		Casa_C c3 = new Casa_C(1,1,3,3,"piso: taco, tomadas:5","piso até o teto: sim, tomadas: 3","guarda roupa embutido: sim, tomadas:3","bidê: sim, tomadas: 2",1,"guarda roupa embutido: não, tomadas:2","guarda roupa embutido: sim, tomadas:3","bidê: sim, tomadas: 2","bidê: não, tomadas: 2","6m² de quintal e 5m² de jardim");
		
		c1.imprimeDados();
		c2.imprimeDados();
		c3.imprimeDados();
	}

}
