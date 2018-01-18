package pkgFita;

public class Disponivel extends Fita{
	
	protected int prateleira;
	
	
	public Disponivel(String data,int p){
		super(data);
		prateleira = p;
	}
	
	public String estado(){
		return "Disponivel";
	}
	
	public void imprimeEstado(){
		super.imprimeEstado();
		System.out.println("Encontra-se na prateleira n�: "+prateleira+"\n");
	}
	

}
