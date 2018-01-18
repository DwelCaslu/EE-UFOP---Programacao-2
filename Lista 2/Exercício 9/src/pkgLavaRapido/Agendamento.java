package pkgLavaRapido;

public class Agendamento extends LavaJato{
	
	public Agendamento(String data, String nome,double preco){
		super(data,nome,preco);
	}
	
	public void ImprimeFicha(){
		super.ImprimeFicha();
		System.out.println("Serviço requerido: Agendamento");
	}

}
