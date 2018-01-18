package pkgCasa;

public class Casa_B extends Casa{
	
	private String cquintal;
	private String cbanheiro2;
	private String cquarto2;
	private String cquarto3;
	
	public Casa_B(int sala,int cozinha,int quarto,int banheiro,String csala,String ccozinha, String cquarto,String cbanheiro,String q2,String q3,String b2,String qui){
		super(sala=1,cozinha=1,quarto=3,banheiro=2,csala,ccozinha,cquarto,cbanheiro);
		cquarto2 = q2;
		cquarto3 = q3;
		cbanheiro2 = b2;
		cquintal =qui;
	}
	
	public void imprimeDados(){
		System.out.println("\n\nTipo: Casa B");
		System.out.println("\nQuantidades :\nsala: "+sala+"\ncozinhas: "+cozinha+"\nquartos: "+quarto+"\nbanheiros: "+banheiro);
		System.out.println("\nCaracterísticas:"+"\nsala: "+csala+"\ncozinha: "+ccozinha+"\nquarto 1: "+cquarto+"\nquarto2: "+cquarto2+"\nquarto 3: "+cquarto3+"\nbanheiro 1: "+cbanheiro+"\nbanheiro 2: "+cbanheiro2+"\nquintal: "+cquintal);
	}

}
