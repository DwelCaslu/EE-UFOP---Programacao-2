package pkgLavaRapido;

public class LavaJato {
	
	protected String data;
	protected String nome;
	protected double preco;
	
	public LavaJato(String d, String n,double p){
		data = d;
		nome = n;
		preco=p;
	}
	 
	 public void ImprimeFicha(){
		 System.out.println("\nCliente: "+nome+"\nValor pago: "+preco+"\ndata: "+data);
	 }

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
