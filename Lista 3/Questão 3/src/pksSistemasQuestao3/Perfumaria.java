package pksSistemasQuestao3;

abstract public class Perfumaria {
	
	protected String endereco,CGC;
	
	public Perfumaria(String e,String cgc){
		endereco = e;
		CGC = cgc;
	}
	
	public abstract double realizarVenda(Perfume p);
	
}
