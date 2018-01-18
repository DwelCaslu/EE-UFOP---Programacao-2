package pkgFita;

public class Manutencao extends Fita {
	
	protected String defeito;
	
	public Manutencao(String data, String d){
		super(data);
		defeito=d;
	}
	
	public String estado(){
		return "em manutenção";
	}
	
	public void imprimeEstado(){
		super.imprimeEstado();
		System.out.println("defeito: "+defeito+"\n");
	}

}
