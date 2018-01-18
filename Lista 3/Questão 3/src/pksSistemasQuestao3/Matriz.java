package pksSistemasQuestao3;

public class Matriz extends Perfumaria{
	
	private String quimico;
	private static double faturamento=0; 
	
	public Matriz(String end,String cgc,String quim){
		super(end,cgc);
		quimico=quim;
	}
	
	public double realizarVenda(Perfume p){
		double preco_venda = p.getPreco() + p.getPreco()*0.5;
		Matriz.incrementaFaturamento(preco_venda);
		return preco_venda;
	}
	
	public static void incrementaFaturamento(double valor){
		faturamento +=valor;
	}

	public static double retornaFaturamento(){
		return faturamento;
	}
}
