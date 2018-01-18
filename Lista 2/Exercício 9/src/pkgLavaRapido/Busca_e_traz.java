package pkgLavaRapido;

public class Busca_e_traz extends LavaJato {
	
	protected String endereco;
	
	public Busca_e_traz(String data, String nome,double preco,String e){
		super(data,nome,preco);
		endereco = e;
	}
	public void ImprimeFicha(){
		super.ImprimeFicha();
		System.out.println("Serviço requerido: Busca e traz");
	}
	
}
