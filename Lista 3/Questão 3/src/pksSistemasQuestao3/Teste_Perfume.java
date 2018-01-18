package pksSistemasQuestao3;

public class Teste_Perfume {

	public static void main(String[] args) {
		Perfume p1= new Perfume(1,"red bull","masculino",500); 
		Perfume p2= new Perfume(1,"sun flower","feminino",350);
		
		Matriz m1 = new Matriz ("rua A","001","José");
		
		Fabrica f1 = new Fabrica("Rua B","002",25);
		Fabrica f2 = new Fabrica("Rua C","003",30);
		
		Loja l1 = new Loja("rua D","004",1);
		Loja l2 = new Loja("rua E","005",2);
		Loja l3 = new Loja("rua F","006",3);
		
		System.out.println("Faturamento: "+Matriz.retornaFaturamento()+"\n");
		
		Perfumaria vet[] = new Perfumaria[6];
		
		vet[0]= m1;
		vet[1]= f1;
		vet[2]= f2;
		vet[3]= l1;
		vet[4]= l2;
		vet[5]= l3;
		
		for(int i=0;i<6;i++){
			System.out.println("valor da venda realizada: "+ vet[i].realizarVenda(p1));
			System.out.println("valor da venda realizada: "+ vet[i].realizarVenda(p2));
		}
		
		System.out.println("\nFaturamento: "+Matriz.retornaFaturamento());
	}
	


}
