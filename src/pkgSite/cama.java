package pkgSite;

public class cama extends Produtos {
	
	private String tipo;

	public cama(String p, int q, double pr, String t) {
		super(p, q, pr);
		tipo = t;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
