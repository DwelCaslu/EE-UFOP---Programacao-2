package pkgFita;

public class Teste_fita {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Disponivel f1 = new Disponivel("10/10/10",5);
	Alugada f2 = new Alugada ("20/20/20","fdsjkf");
	Manutencao f3 = new Manutencao ("05/05/05","quebrada");
	
	f1.imprimeEstado();
	f2.imprimeEstado();
	f3.imprimeEstado();
	
	}

}
