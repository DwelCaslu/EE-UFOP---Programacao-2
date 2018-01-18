package pksSistemasQuestao3;

public class Loja extends Perfumaria{
	
	private int vendedores;
	
	public Loja(String end,String cgc,int vend){
		super(end,cgc);
		vendedores = vend;
	}
	
	public double realizarVenda(Perfume p){
		double preco_venda = p.getPreco() + p.getPreco()*0.75;
		Matriz.incrementaFaturamento(preco_venda);
		return preco_venda;
	}

}
