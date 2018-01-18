package pkgSite;

public class calcado extends Produtos {


	private String cor;
	private int numero;
	
	public calcado(String p, int q, double pr, String c, int n) {
		super(p, q, pr);
		cor = c;
		numero = n;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
