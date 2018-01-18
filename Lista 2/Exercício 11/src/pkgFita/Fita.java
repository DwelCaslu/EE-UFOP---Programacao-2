package pkgFita;

abstract public class Fita {

	protected String data;
	
	public Fita(String d){
		data = d;
	}
	
	abstract public String estado();
	
	public void imprimeEstado(){
		System.out.println("Estado: "+estado()+" , desde: "+data);
	}
}
