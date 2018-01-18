package pkgFatura;

public class Fatura {
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	
	Fatura(String n, String d, int q, double p){
		numero = n;
		descricao = d;
		quantidade = q;
		preco = p;
	}
	
	public void GetFaturaTotal(Fatura fatura){
		if(preco < 0){
			preco=0;
		}
		System.out.println("\nA fatura toral sobre o produto "+descricao+" sera: "+(fatura.getPreco()*fatura.getQuantidade())+"\n");
				
	}
	
	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	 
	

}
