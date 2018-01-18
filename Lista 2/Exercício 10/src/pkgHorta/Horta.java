package pkgHorta;

public class Horta {
	
	Horta[] vetBatata[];
	private  Legumes vetCenoura[],vetTomate[];
	private String dono;
	private double maior1=0, maior2=0,maior3=0;
	private  int tmax; 
	private int total;
	
	public Horta(String d,int b,int c, int t){
		dono = d;
		vetBatata= new Horta[b];
		vetCenoura = new Horta[c];
		vetTomate =  new Horta[t];
		total = 0;
	}
	public void insereLegume(Batata b, Cenoura c, Tomate t){
		if(total == tmax) return ; 
		vetBatata[total] = b;
		vetCenoura[total] = c;
		vetTomate[total] = t;
		total++;
	}
	
	public void ConfereMaiorBatata(){
		for(int i=0;i<tmax;i++){
			if( vetBatata[i].getTamanho() > maior1 ) maior1 = vetBatata[i].getTamanho(); 
		}
		System.out.println("A maior batata tem o tamanho: "+maior1);
	}
	
	public void ConfereMaiorCenoura(){
		for(int i=0;i<tmax;i++){ 
			if( vetCenoura[i].getTamanho() > maior2) maior2 = vetCenoura[i].getTamanho(); 
		}
		System.out.println("A maior cenoura tem o tamanho: "+maior2);
	}
	
	public void ConfereMaiorTomate(){
		for(int i=0;i<tmax;i++){
			if( vetTomate[i].getTamanho() > maior3) maior3 = vetTomate[i].getTamanho(); 
		}
		System.out.println("O maior tomate tem o tamanho: "+maior3);
	}	
}