package pkgMatrix;

public class Teste_exercito {

	
	public static void main(String[] args) {
		
		Tradicional h1 = new Tradicional("Joao",true,true,50,"coronel",20,30);
		Tradicional h2 = new Tradicional("Jose",false,false,0," ",0,40);
		Tradicional h3 = new Tradicional("manel",true,true,200,"major",10,25);
		Tradicional h4 = new Tradicional("mateus",true,true,520,"major",40,30);
		Tradicional h5 = new Tradicional("felipe",true,true,150,"tenente",22,30);
		Artificial h6 = new Artificial("rafael",true,true,80,"tenente",120,30);
		Artificial h7 = new Artificial("bruno",true,true,90,"tenente",20,30);
		Artificial h8 = new Artificial("marcos",true,true,30,"soldado",10,30);
		Artificial h9 = new Artificial("diego",true,true,0,"soldado",360,30);
		Artificial h10 = new Artificial("pedro",true,true,100,"soldado",40,30);
		
	
	Matrix vetTotal[]= new Matrix[10];
	
	vetTotal[0]=h1;
	vetTotal[1]=h2;
	vetTotal[2]=h3;
	vetTotal[3]=h4;
	vetTotal[4]=h5;
	vetTotal[5]=h6;
	vetTotal[6]=h7;
	vetTotal[7]=h8;
	vetTotal[8]=h9;
	vetTotal[9]=h10;
	
	for(int i=0; i<10;i++){
		vetTotal[i].imprimeDados();
	}
	
	System.out.println("\n\nEncontram-se no exercito os seguintes humanos:\n");
	for(int i=0; i<10;i++){
		vetTotal[i].imprimeExercito();
	}
	
	int total=0;
	
	for(int i=0; i<10;i++){
		total= total + vetTotal[i].contMunicao();
	}
	System.out.println("\n\nO total de projeteis do exercito e: "+total);
	
	
	h1.setEstado(false);
	
	System.out.println("\n\nEncontram-se no exercito os seguintes humanos:\n");
	for(int i=0; i<10;i++){
		vetTotal[i].imprimeExercito();
	}
	}
}