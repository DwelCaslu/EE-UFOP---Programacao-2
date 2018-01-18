package pkgCasa;

public class Casa_A extends Casa {
	
	private String cquarto2;
	
	public Casa_A(int sala, int cozinha, int quarto, int banheiro, String csala, String ccozinha, String cquarto,String cbanheiro,String q2){
		super(sala=1,cozinha=1,quarto=2,banheiro=1,csala,ccozinha,cquarto,cbanheiro);
		cquarto2 = q2;
	}
	
	public void imprimeDados(){
		System.out.println("\n\nTipo: Casa A");
		System.out.println("\nQuantidades: "+"\nsala: "+sala+"\ncozinhas: "+cozinha+"\nquartos: "+quarto+"\nbanheiros: "+banheiro);
		System.out.println("\nCaracterísticas:"+"\nsala: " +csala+"\ncozinha: "+ccozinha+"\nquarto 1: "+cquarto+"\nquarto2 "+cquarto2+"\nbanheiro: "+cbanheiro);
	}

}
