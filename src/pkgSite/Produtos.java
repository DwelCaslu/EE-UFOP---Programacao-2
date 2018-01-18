package pkgSite;

public class Produtos {
	
	protected String produto;
	protected int quantidade;
	protected double preco;
	
	public Produtos(String p, int q, double pr){
		produto = p;
		quantidade = q;
		preco = pr;
	}
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String p) {
		this.produto = p;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int q) {
		this.quantidade = q;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
