package pkgCasa;

public class Teste_casa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Casa_A c1 = new Casa_A(1,1,2,1,"piso: Ard�sia, tomadas : 5","piso at� o teto: sim, tomadas: 4","guarda roupa embutido: sim, tomadas:2","bid�: sim, tomadas: 1","guarda roupa embutido: n�o, tomadas:3");
		Casa_B c2 = new Casa_B(1,1,3,2,"piso: azulejo, tomadas: 4","piso at� o teto: n�o, tomadas: 2","guarda roupa embutido: n�o, tomadas:3","bid�: n�o, tomadas: 2","guarda roupa embutido: n�o, tomadas:2","guarda roupa embutido: sim, tomadas:1","bid�: sim, tomadas: 3","10m� de quintal");
		Casa_C c3 = new Casa_C(1,1,3,3,"piso: taco, tomadas:5","piso at� o teto: sim, tomadas: 3","guarda roupa embutido: sim, tomadas:3","bid�: sim, tomadas: 2",1,"guarda roupa embutido: n�o, tomadas:2","guarda roupa embutido: sim, tomadas:3","bid�: sim, tomadas: 2","bid�: n�o, tomadas: 2","6m� de quintal e 5m� de jardim");
		
		c1.imprimeDados();
		c2.imprimeDados();
		c3.imprimeDados();
	}

}
