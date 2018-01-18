package pkgFita;

public class Alugada extends Fita {

protected String matricula;

public Alugada(String data, String m){
	super(data);
	matricula = m;
}
public String estado(){
	return "Alugada";
}
public void imprimeEstado(){
	super.imprimeEstado();	
	System.out.println("Pelo cliente de matricula: "+matricula+"\n");
}
	

}
