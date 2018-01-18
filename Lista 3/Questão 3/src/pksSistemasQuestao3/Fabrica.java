package pksSistemasQuestao3;

public class Fabrica extends Perfumaria{
	
	private int operarios;

	
	public Fabrica(String end,String cgc,int op){
		super(end,cgc);
		operarios = op;
	}
	
	public double realizarVenda(Perfume p){
		double preco_venda = p.getPreco() + p.getPreco()*0.5;
		Matriz.incrementaFaturamento(preco_venda);
		return preco_venda;
	}
}
