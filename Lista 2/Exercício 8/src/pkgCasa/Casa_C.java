package pkgCasa;

public class Casa_C extends Casa{
	
	private int copa;
	private String cquarto2;
	private String cquarto3;
	private String cbanheiro2;
	private String cbanheiro3;
	private String cquintalJardim;
	
	public Casa_C(int sala,int cozinha,int quarto,int banheiro,String csala,String ccozinha, String cquarto,String cbanheiro,int cp,String cq2,String cq3,String cb2,String cb3,String cqui){
		super(sala=1,cozinha=1,quarto=3,banheiro=3,csala,ccozinha,cquarto,cbanheiro);
		copa = cp;
		cquarto2 = cq2;
		cquarto3 = cq3;
		cbanheiro2 = cb2;
		cbanheiro3 = cb3;
		cquintalJardim = cqui;
	}
	
	public void imprimeDados(){
		System.out.println("\n\nTipo: Casa C");
		System.out.println("\nQuantidades :\nsala: "+sala+"\ncozinhas: "+cozinha+"\nquartos: "+quarto+"\nbanheiros: "+banheiro+"\ncopa: "+copa);
		System.out.println("\nCaracterísticas:"+"\nsala: "+csala+"\ncozinha: "+ccozinha+"\nquarto 1: "+cquarto+"\nquarto2: "+cquarto2+"\nquarto3: "+cquarto3+"\nbanheiro 1: "+cbanheiro+"\nbanheiro 2: "+cbanheiro2+"\nbanheiro 3: "+cbanheiro3+"\nquintal e jardim: "+cquintalJardim);
	}

}
