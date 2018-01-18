package pkgCasa;

abstract public class Casa {
	
	protected int sala;
	protected int cozinha;
	protected int quarto;
	protected int banheiro;
	protected String csala;
	protected String ccozinha;
	protected String cquarto;
	protected String cbanheiro;
	
	public Casa(int s, int c, int q, int b, String s1, String c1, String q1, String b1){
		sala = s;
		cozinha = c;
		quarto = q;
		banheiro = b;
		csala = s1;
		ccozinha = c1;
		cquarto = q1;
		cbanheiro = b1;
	}
	
	abstract public void imprimeDados();

}
