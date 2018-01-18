package pkgMatrix;

public class Artificial extends Matrix {
	
	protected int quantec;
	
	public Artificial(String n, boolean e, boolean ex, int q, String p,int c, int t) {
		super(n, e, ex, q, p, c);
		quantec = t;
	}
	
	public void imprimeDados(){
		super.imprimeDados();
		System.out.println(" humano artificial.");
	}



}
