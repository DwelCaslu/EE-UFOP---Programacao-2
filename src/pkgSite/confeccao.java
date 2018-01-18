package pkgSite;

public class confeccao extends Produtos {

	private int numero;
	private String tecido;
	
	public confeccao(String p, int q, double pr, int n, String te) {
		super(p, q, pr);
		numero = n;
		tecido = te;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTecido() {
		return tecido;
	}

	public void setTecido(String tecido) {
		this.tecido = tecido;
	}

}