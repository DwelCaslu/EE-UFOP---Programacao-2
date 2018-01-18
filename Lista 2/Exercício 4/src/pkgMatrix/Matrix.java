package pkgMatrix;

public class Matrix {
	
	protected String nome;
	protected boolean estado;
	protected boolean exer;
	protected int quantproje;
	protected String patente;
	protected int caract;
	public int totalproje;
	
	public Matrix(String n,boolean e,boolean ex,int q,String p,int c){
		nome = n ;
		estado = e ;
		exer = ex;
		quantproje = q;
		patente = p;
		caract = c;
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
    public void imprimeDados(){
	System.out.println("\nNome: "+nome+" ,Estado: "+estado+" ,Patente: "+patente);
	}

    public void imprimeExercito(){
    	if(estado == true && exer == true){
    		System.out.println("Nome: "+ nome+" ,Patente: "+patente);
    	}
    }
    
    public int contMunicao(){
    	if(estado == true && exer == true){
    		totalproje = totalproje + quantproje;
    	}
    	return totalproje;
    }

}
