package pkgMatrix;

public class Tradicional extends Matrix{
	
	protected int idade;
	
	public Tradicional(String n, boolean e,boolean ex,int q,String p, int c,int i){
		super(n , e, ex, q, p, c);
		idade =i;
	}
	
	public void imprimeDados(){
		super.imprimeDados();
		System.out.println(" humano tradicional.");
	}
	

}
